package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Permanently deletes a blog article from a shop's blog. This mutation removes the article and all associated metadata.
 *   
 * For example, when outdated product information or seasonal content needs
 * removal, merchants can use this mutation to clean up their blog.
 *   
 * Use the `articleDelete` mutation to:
 * - Remove outdated or incorrect blog content
 * - Clean up seasonal or time-sensitive articles
 * - Maintain blog organization
 *   
 * The deletion is permanent and returns the deleted article's ID for confirmation.
 */
public class ArticleDeleteGraphQLQuery extends GraphQLQuery {
  public ArticleDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ArticleDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "articleDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ArticleDeleteGraphQLQuery build() {
      return new ArticleDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the article to be deleted.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
