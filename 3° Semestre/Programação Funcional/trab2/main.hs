
-- José Gustavo Victor Pinheiro Alencar 14793765
-- Manassés Arange de Moura 15474205
-- Carolina Gomes Guerreiro 15445453


import System.IO (readFile)
import Data.List (sortBy, sort)
import Data.Ord (comparing, Down(..))

data CountryData = CountryData
  String  
  Int     
  Int    
  Int    
  Int   
  deriving (Show)

splitComma :: String -> [String]
splitComma [] = [""]
splitComma (c:cs)
  | c == ','  = "" : rest
  | otherwise = (c : head rest) : tail rest
  where
    rest = splitComma cs

parseLine :: String -> CountryData
parseLine line =
  let [name, confStr, deathsStr, recStr, activeStr] = splitComma line
  in CountryData
       name
       (read confStr)
       (read deathsStr)
       (read recStr)
       (read activeStr)

getConfirmed :: CountryData -> Int
getConfirmed (CountryData _ c _ _ _) = c

getDeaths :: CountryData -> Int
getDeaths (CountryData _ _ d _ _) = d

getRecovered :: CountryData -> Int
getRecovered (CountryData _ _ _ r _) = r

getActive :: CountryData -> Int
getActive (CountryData _ _ _ _ a) = a

getName :: CountryData -> String
getName (CountryData n _ _ _ _) = n

sumActiveAtLeast :: [CountryData] -> Int -> Int
sumActiveAtLeast list n1 =
  sum [ a | cd@(CountryData _ c _ _ a) <- list, c >= n1 ]

sumDeathsWithinTopActive :: [CountryData] -> Int -> Int -> Int
sumDeathsWithinTopActive list n2 n3 =
  let topByActive = take n2 $
        sortBy (comparing (Down . getActive)) list
      lowestByConfirmed = take n3 $
        sortBy (comparing getConfirmed) topByActive
  in sum [ getDeaths cd | cd <- lowestByConfirmed ]

topConfirmedCountries :: [CountryData] -> Int -> [String]
topConfirmedCountries list n4 =
  let topByConfirmed = take n4 $
        sortBy (comparing (Down . getConfirmed)) list
  in sort [ getName cd | cd <- topByConfirmed ]

main :: IO ()
main = do
  inputLine <- getLine
  let [n1, n2, n3, n4] = map read (words inputLine)

  content <- readFile "dados.csv"
  let allLines       = lines content
      countryDataList = map parseLine allLines

  let totalActive = sumActiveAtLeast countryDataList n1

  let totalDeaths = sumDeathsWithinTopActive countryDataList n2 n3

  let topCountries = topConfirmedCountries countryDataList n4

  putStrLn (show totalActive)
  putStrLn (show totalDeaths)
  mapM_ putStrLn topCountries

