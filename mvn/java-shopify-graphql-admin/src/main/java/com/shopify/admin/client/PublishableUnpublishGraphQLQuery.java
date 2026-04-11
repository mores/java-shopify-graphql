package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PublicationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Unpublishes a resource, such as a
 * [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) or [`Collection`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection),
 * from one or more [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
 * The resource remains in your store but becomes unavailable to customers.
 *   
 * For products to be visible in a channel, they must have an active [`ProductStatus`](https://shopify.dev/docs/api/admin-graphql/latest/enums/ProductStatus).
 */
public class PublishableUnpublishGraphQLQuery extends GraphQLQuery {
  public PublishableUnpublishGraphQLQuery(String id, List<PublicationInput> input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PublishableUnpublishGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "publishableUnpublish";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<PublicationInput> input;

    private String queryName;

    public PublishableUnpublishGraphQLQuery build() {
      return new PublishableUnpublishGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * The resource to delete or update publications for.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Specifies the input fields required to unpublish a resource.
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
