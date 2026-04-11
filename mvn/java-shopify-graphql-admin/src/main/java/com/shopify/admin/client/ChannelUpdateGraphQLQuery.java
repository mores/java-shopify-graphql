package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ChannelUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the properties of an existing [`Channel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel).
 * Use this mutation to update account information — such as the display name
 * shown in Shopify Admin — or to bind the channel to a different channel specification.
 *   
 * Updating the `specificationHandle` triggers re-evaluation of the
 * specification's country coverage against the shop's region markets,
 * reconciling product feeds accordingly. This is also the mechanism for
 * migrating legacy channel records to the multi-channel model by assigning a
 * specification handle.
 */
public class ChannelUpdateGraphQLQuery extends GraphQLQuery {
  public ChannelUpdateGraphQLQuery(String id, ChannelUpdateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ChannelUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "channelUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private ChannelUpdateInput input;

    private String queryName;

    public ChannelUpdateGraphQLQuery build() {
      return new ChannelUpdateGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the [`Channel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel) to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields for updating the channel.
     */
    public Builder input(ChannelUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
