package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Publishes a resource to current channel. If the resource is a product, then
 * it's visible in the channel only if the product status is `active`. Products
 * that are sold exclusively on subscription (`requiresSellingPlan: true`) can be
 * published only on online stores.
 */
public class PublishablePublishToCurrentChannelGraphQLQuery extends GraphQLQuery {
  public PublishablePublishToCurrentChannelGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public PublishablePublishToCurrentChannelGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "publishablePublishToCurrentChannel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public PublishablePublishToCurrentChannelGraphQLQuery build() {
      return new PublishablePublishToCurrentChannelGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The resource to create or update publications for.
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
