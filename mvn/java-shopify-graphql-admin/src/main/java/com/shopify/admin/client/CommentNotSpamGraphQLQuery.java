package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Reverses a spam classification on a comment, restoring it to normal moderation
 * status. This mutation allows merchants to change their decision when a comment
 * has been manually marked as spam.
 *   
 * For example, when a merchant reviews comments marked as spam and finds a
 * legitimate customer question, they can use this mutation to restore the
 * comment's normal status and make it eligible for approval.
 *   
 * Use the `commentNotSpam` mutation to:
 * - Unmark comments that were marked as spam
 * - Restore comments to normal moderation status
 * - Move comments back to the approval queue
 *   
 * This action changes the comment's status from spam back to pending, where it
 * can then be approved or managed according to standard moderation practices.
 */
public class CommentNotSpamGraphQLQuery extends GraphQLQuery {
  public CommentNotSpamGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CommentNotSpamGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "commentNotSpam";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CommentNotSpamGraphQLQuery build() {
      return new CommentNotSpamGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the comment to be marked as not spam.
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
