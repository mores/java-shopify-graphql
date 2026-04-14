package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Permanently removes a comment from a blog article.
 *   
 * For example, when a comment contains spam links or inappropriate language that
 * violates store policies, merchants can delete it entirely.
 *   
 * Use the `commentDelete` mutation to:
 * - Remove spam or inappropriate comments permanently
 * - Clean up irrelevant discussions
 * - Maintain content standards on blog articles
 *   
 * Deletion is permanent and can't be undone.
 */
public class CommentDeleteGraphQLQuery extends GraphQLQuery {
  public CommentDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CommentDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "commentDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CommentDeleteGraphQLQuery build() {
      return new CommentDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the comment to be deleted.
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
