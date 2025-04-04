main = do
    putStrLn "HW"
    putStrLn $ show $ pega 10 $ primos -- pega os 10 primeiros primos
    putStrLn $ show $ pegaEqto (<100) $ primos -- pega os primos menores que 100 ; (<100) -> é uma função que retorna True ou False 
    putStrLn $ show $ soma $ ignoraEqto (<100) $ pegaEqto (<200) $ primos -- soma os primos entre 100 e 200
    putStrLn $ show $ soma $ ignoraEqto (<100) $ pegaEqto (<200) $ primos' -- soma os primos entre 100 e 200 com a função lambda (primos') e é o funcional ao máximo

    -- quebrou a tarefa em pequenas partes e resolveu cada uma
        -- uma função de soma
        -- uma função de pega
        -- uma função de ignora
        -- uma função de filtra
        -- uma função de não é multiplo
        -- uma função de crivo
    -- aparentemente essa é a essencia de funcional

    putStrLn $ show $ zipa [1,2,3] ['a','b','c'] -- [(1,'a'),(2,'b'),(3,'c')]

    putStrLn $ show $ pega 10 $ zipa [1..] primos -- [(1,2),(2,3),(3,5),(4,7),(5,11),(6,13),(7,17),(8,19),(9,23),(10,29)]'

    -- posição do primeio primo maior que 1000
    putStrLn $ show $ primeiro $ head $ ignoraEqto((<1000).segundo) $ zipa [1..] primos -- [(169, 1009)]

    putStrLn $ show $ zipaCom (+) [1,2,3] [4,5,6] -- [5,7,9]
    putStrLn $ show $ zipaCom (*) [1,2,3] [4,5,6] -- [4,10,18]
    putStrLn $ show $ zipaCom (^) [1,2,3] [4,5,6] -- [1,32,729]
    putStrLn $ show $ zipaCom (<) [1,2,3] [4,5,6] -- [True,True,True]
    putStrLn $ show $ zipaCom (,) [1,2,3] [4,5,6] -- [(1,4),(2,5),(3,6)]
    putStrLn $ show $ pega 10 $ zipaCom (+) uns primos

uns = 1:uns


-- crivo de erastostenes

filtra :: (a -> Bool) -> [a] -> [a]
filtra _ [] = []
filtra teste (x:xs)
    | teste x = x : filtra teste xs
    | otherwise = filtra teste xs

naoEhMultiplo :: Integer -> Integer -> Bool
naoEhMultiplo x y = y `mod` x /= 0

naoEhMultiplo' x = \y -> y `mod` x /= 0

-- as funções acima são equivalentes
-- substituir a função naoEhMultiplo' por uma função lambda

pega :: (Eq t, Num t) => t -> [a] -> [a]
pega _ [] = []
pega 0 _ = []
pega n (x:xs) = x : pega (n-1) xs

pegaEqto :: ( a-> Bool) -> [a] -> [a]
pegaEqto _ [] = []
pegaEqto teste (x:xs) -- teste é uma função que retorna True ou False
    | teste x = x : pegaEqto teste xs
    | otherwise = []

ignoraEqto :: ( a-> Bool) -> [a] -> [a]
ignoraEqto _ [] = []
ignoraEqto teste (x:xs)
    | teste x = ignoraEqto teste xs
    | otherwise = x:xs -- caso tenha ignorado, retorna a cabeça atual com a cauda

soma :: (Num a) => [a] -> a
soma [] = 0
soma (x:xs) = x + soma xs

primos :: [Integer]
primos = crivo [2..]
  where
    crivo (x:xs) = x:(crivo $ filtra (naoEhMultiplo x) xs)

-- (.) :: (a -> b) -> (c -> a) -> c -> b
-- (.) f g x = f (g x)

primos' = crivo [2..]
  where
    --crivo (x:xs) = x:(crivo $ filtra (\y -> y `mod` x /= 0) xs)
    crivo (x:xs) = x:(crivo $ filtra ((/=0).(`mod` x)) xs)
    -- f(x).g(x) = f(g(x))
    -- ou seja, o . é uma função que realiza a composição de funções
    -- (/=0) é uma função que retorna se o numero é diferente de 0
    -- `mod` x retorna o resto da divisão
    -- (/=0).(`mod` x) é a composição das duas funções que após pegar o resto da divisão ele "entrega" o resultado para a função (/=0) que retorna se o resultado é diferente de 0, ou seja, se o numero é multiplo de x

zipa :: [a] -> [b] -> [(a,b)]
zipa [] _ = []
zipa _ [] = []
zipa (x:xs) (y:ys) = (x,y):zipa xs ys


primeiro :: (a,b) -> a
primeiro (x,_) = x

segundo :: (a,b) -> b
segundo (_,y) = y

zipaCom :: (a -> b -> c) -> [a] -> [b] -> [c]
zipaCom _ _ [] = []
zipaCom _ [] _ = []
zipaCom op (x:xs) (y:ys) = (op x y):zipaCom op xs ys