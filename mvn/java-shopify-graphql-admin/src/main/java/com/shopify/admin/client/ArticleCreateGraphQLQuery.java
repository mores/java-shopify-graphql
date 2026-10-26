package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ArticleBlogInput;
import com.shopify.admin.types.ArticleCreateInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates an [`Article`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Article). Articles are content pieces that include a title, body text, and author information.
 *   
 * You can publish the article immediately or schedule it with a specific publish
 * date. You can customize the article's URL handle, apply custom templates for
 * rendering, and add optional fields like [tags](https://shopify.dev/docs/api/admin-graphql/latest/mutations/articleCreate#arguments-article.fields.tags), an [image](https://shopify.dev/docs/api/admin-graphql/latest/mutations/articleCreate#arguments-article.fields.image), and [`Metafield`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Metafield) objects.
 *   
 * The mutation validates article content and ensures proper blog association.
 * Error handling provides specific feedback for content requirements.
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

  public ArticleCreateGraphQLQuery(ArticleCreateInput article, ArticleBlogInput blog,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (article != null || fieldsSet.contains("article")) {
        getInput().put("article", article);
    }if (blog != null || fieldsSet.contains("blog")) {
        getInput().put("blog", blog);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private ArticleCreateInput article;

    private ArticleBlogInput blog;

    private String queryName;

    public ArticleCreateGraphQLQuery build() {
      return new ArticleCreateGraphQLQuery(article, blog, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The properties of the new article.
     */
    public Builder articleReference(String variableRef) {
      this.variableReferences.put("article", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ArticleCreateInput"))).build());
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

    /**
     * The properties of the new blog.
     */
    public Builder blogReference(String variableRef) {
      this.variableReferences.put("blog", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ArticleBlogInput")).build());
      this.fieldsSet.add("blog");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
