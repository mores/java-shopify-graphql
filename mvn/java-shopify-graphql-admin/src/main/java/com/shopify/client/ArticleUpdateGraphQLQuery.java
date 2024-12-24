package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ArticleBlogInput;
import com.shopify.types.ArticleUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ArticleUpdateGraphQLQuery extends GraphQLQuery {
  public ArticleUpdateGraphQLQuery(String id, ArticleUpdateInput article, ArticleBlogInput blog,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (article != null || fieldsSet.contains("article")) {
        getInput().put("article", article);
    }if (blog != null || fieldsSet.contains("blog")) {
        getInput().put("blog", blog);
    }
  }

  public ArticleUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "articleUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private ArticleUpdateInput article;

    private ArticleBlogInput blog;

    private String queryName;

    public ArticleUpdateGraphQLQuery build() {
      return new ArticleUpdateGraphQLQuery(id, article, blog, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder article(ArticleUpdateInput article) {
      this.article = article;
      this.fieldsSet.add("article");
      return this;
    }

    
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
