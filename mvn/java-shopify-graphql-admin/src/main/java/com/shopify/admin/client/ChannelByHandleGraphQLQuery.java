package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a [`Channel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel)
 * by its unique string handle. The handle is either set explicitly during [`channelCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/channelCreate)
 * or auto-generated from the specification handle and account ID. The channel
 * must belong to the calling application.
 */
public class ChannelByHandleGraphQLQuery extends GraphQLQuery {
  public ChannelByHandleGraphQLQuery(String handle, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public ChannelByHandleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "channelByHandle";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String handle;

    private String queryName;

    public ChannelByHandleGraphQLQuery build() {
      return new ChannelByHandleGraphQLQuery(handle, queryName, fieldsSet);
               
    }

    /**
     * The unique handle of the [`Channel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel) to return.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
