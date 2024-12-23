package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PublicationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Publishes a resource to a channel. If the resource is a product, then it's
 * visible in the channel only if the product status is `active`. Products that
 * are sold exclusively on subscription (`requiresSellingPlan: true`) can be
 * published only on online stores.
 */
public class PublishablePublishGraphQLQuery extends GraphQLQuery {
  public PublishablePublishGraphQLQuery(String id, List<PublicationInput> input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PublishablePublishGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "publishablePublish";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<PublicationInput> input;

    private String queryName;

    public PublishablePublishGraphQLQuery build() {
      return new PublishablePublishGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * The resource to create or update publications for.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Specifies the input fields required to publish a resource.
     */
    public Builder input(List<PublicationInput> input) {
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
