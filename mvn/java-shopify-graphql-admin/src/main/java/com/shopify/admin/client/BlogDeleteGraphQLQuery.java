package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Permanently deletes a blog from a shop. This mutation removes the blog container and its organizational structure.
 *   
 * For example, when consolidating multiple seasonal blogs into a single
 * year-round content strategy, merchants can use this mutation to remove unused blogs.
 *   
 * Use the `blogDelete` mutation to:
 * - Remove unused or outdated blogs
 * - Consolidate content organization
 * - Clean up blog structure
 *   
 * The deletion is permanent and returns the deleted blog's ID for confirmation.
 */
public class BlogDeleteGraphQLQuery extends GraphQLQuery {
  public BlogDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public BlogDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "blogDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public BlogDeleteGraphQLQuery build() {
      return new BlogDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the blog to be deleted.
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
