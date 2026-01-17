# 学生管理システム（OOP応用版）

![Java](https://img.shields.io/badge/Java-17+-blue)
![OOP](https://img.shields.io/badge/OOP-応用-green)
![Week](https://img.shields.io/badge/Week-5完成-brightgreen)
![License](https://img.shields.io/badge/License-MIT-yellow)
![Lines](https://img.shields.io/badge/Lines-600~700-orange)

**Week 5: Java応用・オブジェクト指向応用 完成版**

継承・ポリモーフィズム・抽象化・例外処理・Lombokを統合した
エンタープライズレベル学生管理システム

## 📋 目次
- [概要](#概要)
- [技術スタック](#技術スタック)
- [主要機能](#主要機能)
- [OOP設計](#oop設計)
- [セットアップ](#セットアップ)
- [使用方法](#使用方法)
- [学習成果](#学習成果)
- [今後の拡張予定](#今後の拡張予定)
- [ライセンス](#ライセンス)

## 🎯 概要

このプロジェクトは、Java学習プログラムWeek 5の集大成として開発された、
オブジェクト指向プログラミングの高度な概念を統合した学生管理システムです。

### ✨ 特徴
- **継承階層**: Person → Student の明確な継承関係
- **ポリモーフィズム**: 統一インターフェースによる異なる学生タイプの処理
- **抽象化**: インターフェース・抽象クラスによる設計品質確保
- **例外処理**: カスタム例外による堅牢なエラーハンドリング
- **Lombok統合**: 86%のコード削減による効率的な開発

## 🛠️ 技術スタック

| 技術 | バージョン | 用途 |
|------|------------|------|
| Java | 17+ | 主要開発言語 |
| Lombok | Latest | コード生成・効率化 |
| Maven | 3.6+ | 依存関係管理 |
| JUnit | 5+ | 単体テスト（拡張予定） |

### 📦 依存関係
```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.28</version>
</dependency>


## 🌿 ブランチ戦略

このプロジェクトでは**Feature Branch Workflow**を採用しています。

### ブランチ構成

- **`main`**: 安定版ブランチ。常にデプロイ可能な状態を維持
- **`feature/*`**: 機能開発ブランチ。Issue番号と機能名で命名
  - 例: `feature/issue-1-fix-deletion-confirmation`
  - 例: `feature/issue-2-add-csv-export`

### 開発フロー

1. **Issue作成**: GitHub Issuesで作業内容を明確化
2. **ブランチ作成**: `git switch -c feature/issue-X-description`
3. **機能開発**: 独立した環境で安全に開発
4. **コミット**: 明確なコミットメッセージで記録
5. **マージ**: mainブランチに統合後、フィーチャーブランチを削除

### コミットメッセージ規約

- **Fix #X**: バグ修正
- **Add #X**: 新機能追加
- **Update #X**: 既存機能改善
- **Remove #X**: 機能削除

例:
```bash
git commit -m "Fix #1: 削除確認機能の入力判定を改善

- 大文字小文字を区別しない判定に変更
- y/yes/はい/削除 の複数パターンに対応"
