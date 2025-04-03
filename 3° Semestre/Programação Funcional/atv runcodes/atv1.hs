-- escrever a formula de heron 

main = do
    a <- readLn
    b <- readLn
    c <- readLn
    putStrLn $ heron a b c

-- usando guarda 
-- soma de dois lados tem que ser sempre maior que o outro lado
heron a b c
    | a + b < c = "-"
    | a + c < b = "-"
    | b + c < a = "-"
    | otherwise  = show x
    where
        p = (a + b + c) / 2
        x = sqrt (p * (p - a) * (p - b) * (p - c))


