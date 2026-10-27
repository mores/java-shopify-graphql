package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ArticleBlogInput;
import com.shopify.admin.types.ArticleUpdateInput;
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
 * Updates an existing [`Article`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Article).
 * You can modify the article's content, metadata, publication status, and
 * associated properties like author information and tags.
 *   
 * If you update the [`handle`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/articleUpdate#arguments-article.fields.handle),
 * then you can optionally create a redirect from the old URL to the new one by setting [`redirectNewHandle`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/articleUpdate#arguments-article.fields.redirectNewHandle) to `true`.
 */
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

  public ArticleUpdateGraphQLQuery(String id, ArticleUpdateInput article, ArticleBlogInput blog,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (article != null || fieldsSet.contains("article")) {
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private ArticleUpdateInput article;

    private ArticleBlogInput blog;

    private String queryName;

    public ArticleUpdateGraphQLQuery build() {
      return new ArticleUpdateGraphQLQuery(id, article, blog, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the article to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the article to be updated.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The properties of the article to be updated.
     */
    public Builder article(ArticleUpdateInput article) {
      this.article = article;
      this.fieldsSet.add("article");
      return this;
    }

    /**
     * The properties of the article to be updated.
     */
    public Builder articleReference(String variableRef) {
      this.variableReferences.put("article", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ArticleUpdateInput"))).build());
      this.fieldsSet.add("article");
      return this;
    }

    /**
     * The properties of the blog to be created.
     */
    public Builder blog(ArticleBlogInput blog) {
      this.blog = blog;
      this.fieldsSet.add("blog");
      return this;
    }

    /**
     * The properties of the blog to be created.
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
