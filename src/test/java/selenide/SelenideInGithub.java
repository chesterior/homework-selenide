package selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideInGithub {
    @Test
    void openSoftAssertionWithCodeForJUnit5() {

        //    Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");

        //    Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();

        //    Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        //    Откройте страницу SoftAssertions
        $(byText("Soft assertions")).click();

        //    проверьте что внутри есть пример кода для JUnit5
        $("#wiki-body").should(text("JUnit5"));
    }
}
