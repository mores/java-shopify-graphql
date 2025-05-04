package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ArticleTagSort;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * List of all article tags.
 */
public class ArticleTagsGraphQLQuery extends GraphQLQuery {
  public ArticleTagsGraphQLQuery(ArticleTagSort sort, int limit, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (sort != null || fieldsSet.contains("sort")) {
        getInput().put("sort", sort);
    }getInput().put("limit", limit);                   
  }

  public ArticleTagsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "articleTags";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ArticleTagSort sort;

    private int limit;

    private String queryName;

    public ArticleTagsGraphQLQuery build() {
      return new ArticleTagsGraphQLQuery(sort, limit, queryName, fieldsSet);
               
    }

    /**
     * Type of sort order.
     */
    public Builder sort(ArticleTagSort sort) {
      this.sort = sort;
      this.fieldsSet.add("sort");
      return this;
    }

    /**
     * The maximum number of tags to return.
     */
    public Builder limit(int limit) {
      this.limit = limit;
      this.fieldsSet.add("limit");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
