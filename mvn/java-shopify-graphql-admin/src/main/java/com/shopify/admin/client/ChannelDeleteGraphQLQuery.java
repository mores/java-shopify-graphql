package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a [`Channel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel)
 * from the shop. All associated product feeds are removed. Existing orders
 * attributed to the channel are preserved. The channel must have been created via [`channelCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/channelCreate).
 */
public class ChannelDeleteGraphQLQuery extends GraphQLQuery {
  public ChannelDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ChannelDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "channelDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ChannelDeleteGraphQLQuery build() {
      return new ChannelDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the channel to delete.
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
