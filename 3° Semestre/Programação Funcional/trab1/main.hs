-- José Gustavo Victor Pinheiro Alencar 14793765
-- Manassés Arange de Moura 15474205
-- Carolina Gomes Guerreiro 15445453


main = do 
    entrada <- getLine
    putStrLn $ formatarFrames $ tratarEntrada entrada

    --let listaNum = map read listaStr :: [Int]

entrada1 = "1 4 4 5 6 4 5 5 10 0 1 7 3 6 4 10 2 8 6"
entrada2 = "10 10 10 10 10 10 10 10 10 10 10 10"

tratarEntrada :: String -> [Int]
tratarEntrada entrada = map read (words entrada)

-- entrada:
-- 1 4 4 5 6 4 5 5 10 0 1 7 3 6 4 10 2 8 6
-- ideias:
-- a cada vez que x == 10 ele vai pegar os proximos 2 pontos e somar junto de 10 - criar função proxdois - não precisa mais, existe a sum e take (take pega 2 e sum soma o return do take)
-- acho que o head(take 1 xs) é desnecessário, mas n pensei em nd pra substituir
somarPontos :: [Int] -> Int
somarPontos jogadas = somar jogadas 1

somar :: [Int] -> Int -> Int
somar _ 11 = 0 -- para quando passou de 10 frames (jogadas)
somar (10:xs) frame = 10 + bonusStrike xs + somar xs (frame + 1) -- strike: acontece quando a primeira jogada do frame é 10 -> 10 + x+1 x2
-- 10 + (0 + 1) + somar (0:1:...) (frame + 1)
somar (x:y:xs) frame
  | x + y == 10 = 10 + bonusSpare xs + somar xs (frame + 1) -- "soma 10, soma bonusspare e soma o restante da lista a partir do ponto onde parou + 1"
  -- (6:4:3:...) -> 10 + 3 + somar (3:...) (frame + 1)
  | otherwise   = x + y + somar xs (frame + 1) -- frame normal
somar _ _ = 0

bonusStrike = sum . take 2 -- pega os 2 da frente e soma
bonusSpare = sum . take 1 -- pega 1 da frente e soma


formatarFrames :: [Int] -> String
formatarFrames jogadas =
  let (primeiros9, restante) = extrair9prim jogadas
      frames9 = formatframes primeiros9 1 "" -- separa os 9 primeiros frames para tratar separado do ultimo
      frame10 = formatarUltimoFrame restante
  in frames9 ++ frame10 ++ " " ++ (show $ (somarPontos jogadas))

-- extrai os lançamentos que compõem os 9 primeiros frames (mais fácil de tratar isoladamente)
extrair9prim :: [Int] -> ([Int], [Int])
extrair9prim = extrair 1 []
  where
    extrair 10 acc restante = (reverse acc, restante)
    extrair n acc (10:xs)   = extrair (n+1) (10 : acc) xs -- strike
    extrair n acc (x:y:xs)  = extrair (n+1) (y : x : acc) xs -- spare
    extrair _ acc restante  = (reverse acc, restante)

-- Formata os 9 primeiros frames
formatframes :: [Int] -> Int -> String -> String
formatframes [] _ res = res
formatframes (10:xs) frame res = formatframes xs (frame + 1) (res ++ "X _ | ") -- strike 
formatframes (x:y:xs) frame res
  | x + y == 10 = formatframes xs (frame + 1) (res ++ show x ++ " / | ") -- spare
  | otherwise   = formatframes xs (frame + 1) (res ++ show x ++ " " ++ show y ++ " | ") -- normal

-- FORMATAÇÃO DO ULTIMO FRAME 

-- Formata o último frame (com até 3 jogadas)
formatarUltimoFrame :: [Int] -> String
formatarUltimoFrame (10:x:y:_) = "X " ++ formatarPeca x ++ " " ++ formatarPecaFinal x y ++ " |"
formatarUltimoFrame (x:y:z:_)
  | x + y == 10 = show x ++ " / " ++ formatarPeca z ++ " |"
  | otherwise   = show x ++ " " ++ show y ++ " |"
formatarUltimoFrame (x:y:_) = show x ++ " " ++ show y ++ " |" -- <-- NOVO CASO ADICIONADO
-- antes o codigo n interpretava qnd n tinha bonus (erro juvenil)
formatarUltimoFrame _ = ""


-- Mostra uma jogada (10 → "X", senão valor)
formatarPeca :: Int -> String
formatarPeca 10 = "X"
formatarPeca n   = show n

-- Decide o símbolo final: "/" se spare, "X" se strike, número senão
formatarPecaFinal :: Int -> Int -> String
formatarPecaFinal 10 10 = "X"
formatarPecaFinal 10 n  = formatarPeca n
formatarPecaFinal x y
  | x + y == 10 = "/"
  | otherwise   = show y
