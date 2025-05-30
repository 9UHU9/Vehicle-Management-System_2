@echo off
echo コンパイルを開始します...
if not exist bin mkdir bin
javac -d bin src/com/example/model/*.java src/com/example/main/*.java
if %ERRORLEVEL% EQU 0 (
    echo コンパイルが成功しました
    echo 実行するには: java -cp bin com.example.main.Main
) else (
    echo コンパイルに失敗しました。
) 