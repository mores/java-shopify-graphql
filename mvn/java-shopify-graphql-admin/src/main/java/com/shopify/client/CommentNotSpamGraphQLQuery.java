package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Marks a comment as not spam.
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