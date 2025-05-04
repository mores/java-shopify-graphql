package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Adds a line item from an existing product variant. As of API version 2025-04, the [orderEditAddVariant](https://shopify.dev/api/admin-graphql/latest/mutations/ordereditaddvariant)
 * API will respect the contextual pricing of the variant.
 */
public class OrderEditAddVariantGraphQLQuery extends GraphQLQuery {
  public OrderEditAddVariantGraphQLQuery(String id, String variantId, String locationId,
      int quantity, Boolean allowDuplicates, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (variantId != null || fieldsSet.contains("variantId")) {
        getInput().put("variantId", variantId);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }getInput().put("quantity", quantity);                   if (allowDuplicates != null || fieldsSet.contains("allowDuplicates")) {
        getInput().put("allowDuplicates", allowDuplicates);
    }
  }

  public OrderEditAddVariantGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditAddVariant";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String variantId;

    private String locationId;

    private int quantity;

    private Boolean allowDuplicates;

    private String queryName;

    public OrderEditAddVariantGraphQLQuery build() {
      return new OrderEditAddVariantGraphQLQuery(id, variantId, locationId, quantity, allowDuplicates, queryName, fieldsSet);
               
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * to edit.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the variant to add.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      this.fieldsSet.add("variantId");
      return this;
    }

    /**
     * The ID of the [location](https://shopify.dev/api/admin-graphql/latest/objects/location)
     * to check for inventory availability. A default location ID is chosen automatically if none is provided.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The quantity of the item to add to the order. Must be a positive value.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      this.fieldsSet.add("quantity");
      return this;
    }

    /**
     * Whether the mutation can create a line item for a variant that's already on the calculated order.
     */
    public Builder allowDuplicates(Boolean allowDuplicates) {
      this.allowDuplicates = allowDuplicates;
      this.fieldsSet.add("allowDuplicates");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
