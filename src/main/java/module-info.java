module com.example.test11_4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql; // 声明对 java.sql 模块的依赖

    opens com.example.test11_4 to javafx.fxml;
    exports com.example.test11_4;
}