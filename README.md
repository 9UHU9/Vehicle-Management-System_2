# 乗り物管理システム

このプロジェクトは、車や自転車などの乗り物を管理するためのシンプルなJavaアプリケーションです。

## 機能

- 人物（Person）の情報管理
- 乗り物（Vehicle）の情報管理
  - 車（Car）
  - 自転車（Bicycle）
- 乗り物の所有者管理
- 走行距離の記録
- 車の燃料管理

## 必要条件

- Java 8以上
- Windows環境（バッチファイルを使用）

## 使い方

1. プロジェクトをクローン
```bash
git clone [リポジトリのURL]
```

2. コンパイル
```bash
compile.bat
```

3. 実行
```bash
run.bat
```

## プロジェクト構造

```
src/
  └── com/
      └── example/
          ├── model/      # モデルクラス
          │   ├── Person.java
          │   ├── Vehicle.java
          │   ├── Car.java
          │   └── Bicycle.java
          └── main/       # メインアプリケーション
              └── Main.java
```

## ライセンス

MITライセンス 