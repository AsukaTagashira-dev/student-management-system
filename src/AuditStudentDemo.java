//Week6追加

import java.time.LocalDate;

// Week6追加
public class AuditStudentDemo {

    public static void main(String[] args) {
        System.out.println("=== AuditStudent（聴講生）テストプログラム ===");
        System.out.println("Week 6レッスン4：新規ファイル追加の実践\n");

        // 聴講生の作成
        AuditStudent student1 = new AuditStudent(
            "AUD001",
            "田中聴子",
            LocalDate.now().minusYears(28),
            "tanaka@audit.example.com",
            "Java基礎講座"
        );

        AuditStudent student2 = new AuditStudent(
            "AUD002",
            "佐藤聴太",
            LocalDate.now().minusYears(35),
            "sato@audit.example.com",
            "Spring Boot実践講座"
        );

        // 基本情報の表示
        System.out.println("1. 聴講生基本情報");
        student1.showDetails();
        System.out.println();
        student2.showDetails();
        System.out.println();

        // 出席のシミュレーション
        System.out.println("2. 出席状況のシミュレーション");
        for (int i = 0; i < 8; i++) {
            student1.markAttendance();
        }

        for (int i = 0; i < 12; i++) {
            student2.markAttendance();
        }
        System.out.println();

        // レポート生成
        System.out.println("3. 聴講生レポート");
        System.out.println(student1.generateAuditReport());
        System.out.println();
        System.out.println(student2.generateAuditReport());
        System.out.println();

        // 聴講終了
        System.out.println("4. 聴講終了処理");
        student1.endAudit();
        student1.markAttendance(); // 終了後の出席試行

        System.out.println("\n=== テスト完了 ===");
    }
}

