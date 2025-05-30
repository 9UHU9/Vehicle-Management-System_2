# 車両管理システム

このプロジェクトは、車や自転車などの乗り物を管理するためのシンプルなJavaアプリケーションです。
オブジェクト指向プログラミングの基本的な概念（継承、カプセル化、ポリモーフィズム）を実装した例としても参考になります。

## 主な機能

### 人物（Person）の管理
- 名前（姓、名、ミドルネーム）の管理
- 年齢、身長、体重の記録
- BMIの計算
- 乗り物の購入（所有権の設定）

### 乗り物（Vehicle）の管理
- 抽象クラスとして実装
- 共通機能：
  - 名前と色の管理
  - 走行距離の記録
  - 所有者の管理
  - 情報の表示

### 車（Car）の機能
- 燃料管理（給油、消費）
- 走行時の燃料チェック
- 満タン（100L）までの給油制限

### 自転車（Bicycle）の機能
- シンプルな走行機能
- 燃料不要の移動手段

## 技術スタック

- Java 8以上
- オブジェクト指向プログラミング
  - 継承（Vehicle → Car, Bicycle）
  - カプセル化（privateフィールド、publicメソッド）
  - ポリモーフィズム（抽象クラスと具象クラス）

## 必要条件

- Java 8以上のJDK
- Windows環境（バッチファイルを使用）

## インストール方法

1. リポジトリのクローン
```bash
git clone https://github.com/9UHU9/VehicleManagementSystem_2.git
cd VehicleManagementSystem_2
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
          │   ├── Person.java    # 人物クラス
          │   ├── Vehicle.java   # 乗り物の抽象クラス
          │   ├── Car.java       # 車クラス
          │   └── Bicycle.java   # 自転車クラス
          └── main/       # メインアプリケーション
              └── Main.java      # エントリーポイント
```

## 使用例

```java
// 人物の作成
Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);

// 乗り物の作成
Car car = new Car("フェラーリ", "赤");
Bicycle bicycle = new Bicycle("ビアンキ", "緑");

// 乗り物の購入
person1.buy(car);
person2.buy(bicycle);

// 走行
car.run(10);      // 10km走行
bicycle.run(5);   // 5km走行

// 給油
car.charge(20);   // 20L給油
```

## 拡張性

このシステムは以下のような拡張が可能です：

1. 新しい乗り物の追加
   - `Vehicle`クラスを継承
   - 必要な機能を実装

2. 機能の追加
   - メンテナンス記録
   - 保険情報
   - 走行履歴

## ライセンス

MITライセンス

## 作者

9UHU9

## 更新履歴

- 2024/05/30: 初期バージョンリリース
  - 基本的な乗り物管理機能の実装
  - 人物と乗り物の関連付け
  - 走行と給油機能の実装
