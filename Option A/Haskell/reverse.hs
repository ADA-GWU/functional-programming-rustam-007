revers :: [Int] -> [Int]
revers [] = []
revers (x:a) = revers a ++ [x]

main :: IO()
main = do
    input <- getLine
    let stringToIntList = map read . words
    let myList = stringToIntList input
    let result = revers myList
    putStrLn $ show result
