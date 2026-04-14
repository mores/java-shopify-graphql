package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Approves a pending comment, making it visible to store visitors on the associated blog article.
 *   
 * For example, when a customer submits a question about a product in a blog
 * post, merchants can approve the comment to make it publicly visible.
 *   
 * Use the `commentApprove` mutation to:
 * - Publish pending comments after review
 * - Enable customer discussions on blog articles
 * - Maintain quality control over comments
 *   
 * Once approved, the comment becomes visible to all store visitors.
 */
public class CommentApproveGraphQLQuery extends GraphQLQuery {
  public CommentApproveGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CommentApproveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "commentApprove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CommentApproveGraphQLQuery build() {
      return new CommentApproveGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the comment to be approved.
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
