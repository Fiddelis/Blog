package com.fiddelis.blog.config;

import com.fiddelis.blog.models.Article;
import com.fiddelis.blog.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private ArticleService articleService;

    @Override
    public void run(String... args) throws Exception {
        List<Article> articles = articleService.getAll();

        if(articles.isEmpty()) {
            Article article1 = new Article();
            article1.setTitle("Titulo do Primeiro Post");
            article1.setBody("<p>\n" +
                    "            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, \n" +
                    "            dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula \n" +
                    "            massa, varius a, semper congue, euismod non, mi. Proin porttitor, orci nec nonummy molestie, enim est \n" +
                    "            eleifend mi, non fermentum diam nisl sit amet erat. Duis semper. Duis arcu massa, scelerisque vitae, \n" +
                    "            consequat in, pretium a, enim. Pellentesque congue.\n" +
                    "        </p>\n" +
                    "        <br>\n" +
                    "        <p>\n" +
                    "            Ut in risus volutpat libero pharetra tempor. Cras vestibulum bibendum augue. Praesent egestas leo in pede. \n" +
                    "            Praesent blandit odio eu enim. Pellentesque sed dui ut augue blandit sodales. Vestibulum ante ipsum primis \n" +
                    "            in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam nibh. Mauris ac mauris sed pede pellentesque \n" +
                    "            fermentum. Maecenas adipiscing ante non diam sodales hendrerit.\n" +
                    "        </p>\n" +
                    "        <br>\n" +
                    "        <p>\n" +
                    "            Donec quis dui at dolor tempor interdum. Integer ante arcu, accumsan a, consectetuer eget, posuere ut, \n" +
                    "            mauris. Praesent adipiscing. Phasellus ullamcorper ipsum rutrum nunc. Nunc nonummy metus. Vestibulum volutpat \n" +
                    "            pretium libero. Cras id dui. Aenean ut eros et nisl sagittis vestibulum. Nullam nulla eros, ultricies sit \n" +
                    "            amet, nonummy id, imperdiet feugiat, pede. Sed lectus. Donec mollis hendrerit risus. Phasellus nec sem in justo \n" +
                    "            pellentesque facilisis. Etiam imperdiet imperdiet orci. Nunc nec neque.\n" +
                    "        </p>");
            Article article2 = new Article();
            article2.setTitle("Titulo do Segundo Post");
            article2.setBody("<p>\n" +
                    "            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, \n" +
                    "            dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula \n" +
                    "            massa, varius a, semper congue, euismod non, mi. Proin porttitor, orci nec nonummy molestie, enim est \n" +
                    "            eleifend mi, non fermentum diam nisl sit amet erat. Duis semper. Duis arcu massa, scelerisque vitae, \n" +
                    "            consequat in, pretium a, enim. Pellentesque congue.\n" +
                    "        </p>\n" +
                    "        <br>\n" +
                    "        <p>\n" +
                    "            Ut in risus volutpat libero pharetra tempor. Cras vestibulum bibendum augue. Praesent egestas leo in pede. \n" +
                    "            Praesent blandit odio eu enim. Pellentesque sed dui ut augue blandit sodales. Vestibulum ante ipsum primis \n" +
                    "            in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam nibh. Mauris ac mauris sed pede pellentesque \n" +
                    "            fermentum. Maecenas adipiscing ante non diam sodales hendrerit.\n" +
                    "        </p>\n" +
                    "        <br>\n" +
                    "        <p>\n" +
                    "            Donec quis dui at dolor tempor interdum. Integer ante arcu, accumsan a, consectetuer eget, posuere ut, \n" +
                    "            mauris. Praesent adipiscing. Phasellus ullamcorper ipsum rutrum nunc. Nunc nonummy metus. Vestibulum volutpat \n" +
                    "            pretium libero. Cras id dui. Aenean ut eros et nisl sagittis vestibulum. Nullam nulla eros, ultricies sit \n" +
                    "            amet, nonummy id, imperdiet feugiat, pede. Sed lectus. Donec mollis hendrerit risus. Phasellus nec sem in justo \n" +
                    "            pellentesque facilisis. Etiam imperdiet imperdiet orci. Nunc nec neque.\n" +
                    "        </p>");

            articleService.save(article1);
            articleService.save(article2);
        }
    }
}
