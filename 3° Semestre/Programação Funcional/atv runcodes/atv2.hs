main :: IO ()
main = do
  a <- readLn
  b <- readLn

  let numeros = pega a b [1..b]
      countDef = length [x | x <- numeros, classifica x == 0]
      countPerf = length [x | x <- numeros, classifica x == 1]
      countAbund = length [x | x <- numeros, classifica x == 2]

  print countDef
  print countPerf
  print countAbund



-- Função que classifica um número como defeituoso, perfeito ou abundante.
classifica :: (Integral a, Num a) => a -> a
classifica n
  | s - n < n  = 0 -- defeituoso
  | s - n == n = 1 -- perfeito
  | otherwise  = 2 -- abundante
  where s = somaDivisores n

somaDivisores :: Integral a => a -> a
somaDivisores n = soma [x | x <- [1 .. n], n `mod` x == 0]
  where
    soma []     = 0
    soma (x:xs) = x + soma xs

pega :: (Ord a) => a -> a -> [a] -> [a]
pega _ _ [] = []
pega a b (x:xs)
  | x >= a && x <= b = x : pega a b xs
  | otherwise        = pega a b xs

