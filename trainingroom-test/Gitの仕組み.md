
# ブランチの取り込み

自身の作業ブランチにAさんの修正したソースコードを反映したい場合の手順を記載する。
- 自分の作業ブランチ名 => `self`
- Aさんの作業ブランチ名 => `A_branch`

## 前提

- [ ] `self` と `A_branch` は `master` からの派生ブランチであること

## ローカルで取り込みたい場合

Eclipseの`Git リポジトリー`にて、対象リポジトリー名を右クリック

`プル`をクリック

ブランチ => ローカルを展開して`self`を右クリック

`マージ`を選択

次画面でリモートトラッキングの`origin/A_branch`を選択

その他の設定値は変更せずに`マージ`をクリック

以下のメッセージが表示されれば正常完了

```
結果：Already-up-to-date
```

## GitHub上(リモートリポジトリ)で取り込みたい場合

GitHubにログイン、対象のリポジトリーページを開く

Pull request をタブを開き`New pull request`をクリックする。

baseに`self`を選択、compareに`A_branch`を選択

諸々入力して`Create pull request`をクリック

レビューしてもらってOKであれば、対象のpull request ページの`Merge pull request`をクリック

以下のメッセージが表示されればOK

```
Pull request successfully merged and closed
```

