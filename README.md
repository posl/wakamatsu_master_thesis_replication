1. Defects4J,AVATAR,TBar,SimFix,Repilot,AlphaRepair,RAP-Genをインストールする．
2. Dockerfileを使用して，コンテナを立ち上げる
3. script内のmain.shを実行する
  - `./script/main.sh <BugID> <isGenerateTest> <APR>`
`BugID`: defect4jのmathのプロジェクト番号．
`isGenerateTest`: 自動生成したテストケースを追加しない場合は０，追加する場合は１．
`APR`: AVATAR,TBar,SimFix,Repilot,AlphaRepair,RAP-Genそれぞれ，1,2,3,4,5,6．

4. data/wakamatsu-apr内に実験結果が出力される．