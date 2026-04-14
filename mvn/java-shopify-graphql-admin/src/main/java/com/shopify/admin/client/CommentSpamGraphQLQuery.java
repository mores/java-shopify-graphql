package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Marks a comment as spam, removing it from public view. This mutation enables
 * merchants to quickly handle unwanted promotional content, malicious links, or
 * other spam that appears in blog discussions.
 *   
 * For example, when a comment contains suspicious links to unrelated products or
 * services, merchants can mark it as spam to immediately hide it from customers.
 *   
 * Use the `commentSpam` mutation to:
 * - Hide promotional or malicious comments from public view
 * - Protect customers from potentially harmful links
 * - Maintain professional discussion quality on blog articles
 *   
 * Spam-marked comments can be reviewed later and potentially restored using the
 * `commentNotSpam` mutation if they were incorrectly classified.
 */
public class CommentSpamGraphQLQuery extends GraphQLQuery {
  public CommentSpamGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CommentSpamGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "commentSpam";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CommentSpamGraphQLQuery build() {
      return new CommentSpamGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the comment to be marked as spam.
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
