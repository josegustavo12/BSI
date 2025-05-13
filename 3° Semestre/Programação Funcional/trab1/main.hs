main = do 
    entrada <- getLine
    let listaStr = words entrada
    putStrLn $ show $ somarPontos $ tratarEntrada entrada
    --let listaNum = map read listaStr :: [Int]



tratarEntrada :: String -> [Int]
tratarEntrada entrada = map read (words entrada)

-- entrada:
-- 1 4 4 5 6 4 5 5 10 0 1 7 3 6 4 10 2 8 6
-- ideias:
-- a cada vez que x == 10 ele vai pegar os proximos 2 pontos e somar junto de 10 - criar função proxdois - não precisa mais, existe a sum e take (take pega 2 e sum soma o return do take)
-- acho que o head(take 1 xs) é desnecessário, mas n pensei em nd pra substituir
somarPontos :: [Int] -> Int
somarPontos [] = 0
somarPontos [x] = x
somarPontos (x:y:xs)
    | x == 10 = 10 + sum(take 2 (y:xs)) + somarPontos (y:xs)  -- strike
    | x + y == 10 = 10 + head (take 1 xs) + somarPontos xs 
    | otherwise = x + y + somarPontos xs

