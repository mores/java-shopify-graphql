package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Publishes a resource to the current
 * [`Channel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel)
 * associated with the requesting app. The system determines the current channel
 * by the app's API client ID. Resources include
 * [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) and [`Collection`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
 * objects that implement the [`Publishable`](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/Publishable) interface.
 *   
 * For products to be visible in the channel, they must have an active [`ProductStatus`](https://shopify.dev/docs/api/admin-graphql/latest/enums/ProductStatus).
 * Products sold exclusively on subscription ([`requiresSellingPlan`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product#field-Product.fields.requiresSellingPlan):
 * `true`) can only be published to online stores.
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
