package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Unpublishes a resource from the current channel. If the resource is a product,
 * then it's visible in the channel only if the product status is `active`.
 */
public class PublishableUnpublishToCurrentChannelGraphQLQuery extends GraphQLQuery {
  public PublishableUnpublishToCurrentChannelGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public PublishableUnpublishToCurrentChannelGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "publishableUnpublishToCurrentChannel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public PublishableUnpublishToCurrentChannelGraphQLQuery build() {
      return new PublishableUnpublishToCurrentChannelGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The resource to delete or update publications for.
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
