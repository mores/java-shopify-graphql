package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ArticleBlogInput;
import com.shopify.types.ArticleCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates an article.
 */
public class ArticleCreateGraphQLQuery extends GraphQLQuery {
  public ArticleCreateGraphQLQuery(ArticleCreateInput article, ArticleBlogInput blog,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (article != null || fieldsSet.contains("article")) {
        getInput().put("article", article);
    }if (blog != null || fieldsSet.contains("blog")) {
        getInput().put("blog", blog);
    }
  }

  public ArticleCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "articleCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ArticleCreateInput article;

    private ArticleBlogInput blog;

    private String queryName;

    public ArticleCreateGraphQLQuery build() {
      return new ArticleCreateGraphQLQuery(article, blog, queryName, fieldsSet);
               
    }

    /**
     * The properties of the new article.
     */
    public Builder article(ArticleCreateInput article) {
      this.article = article;
      this.fieldsSet.add("article");
      return this;
    }

    /**
     * The properties of the new blog.
     */
    public Builder blog(ArticleBlogInput blog) {
      this.blog = blog;
      this.fieldsSet.add("blog");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
