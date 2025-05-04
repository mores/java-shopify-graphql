package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MoneyInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Adds a custom line item to an existing order. For example, you could add a
 * gift wrapping service as a [custom line item](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing#add-a-custom-line-item).
 * To learn how to edit existing orders, refer to [Edit an existing order with Admin API](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
 */
public class OrderEditAddCustomItemGraphQLQuery extends GraphQLQuery {
  public OrderEditAddCustomItemGraphQLQuery(String id, String title, String locationId,
      MoneyInput price, int quantity, Boolean taxable, Boolean requiresShipping, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (title != null || fieldsSet.contains("title")) {
        getInput().put("title", title);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (price != null || fieldsSet.contains("price")) {
        getInput().put("price", price);
    }getInput().put("quantity", quantity);                   if (taxable != null || fieldsSet.contains("taxable")) {
        getInput().put("taxable", taxable);
    }if (requiresShipping != null || fieldsSet.contains("requiresShipping")) {
        getInput().put("requiresShipping", requiresShipping);
    }
  }

  public OrderEditAddCustomItemGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditAddCustomItem";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String title;

    private String locationId;

    private MoneyInput price;

    private int quantity;

    private Boolean taxable;

    private Boolean requiresShipping;

    private String queryName;

    public OrderEditAddCustomItemGraphQLQuery build() {
      return new OrderEditAddCustomItemGraphQLQuery(id, title, locationId, price, quantity, taxable, requiresShipping, queryName, fieldsSet);
               
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * to which the custom item is added.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The name of the custom item to add.
     */
    public Builder title(String title) {
      this.title = title;
      this.fieldsSet.add("title");
      return this;
    }

    /**
     * The ID of the retail [location](https://shopify.dev/api/admin-graphql/latest/objects/location)
     * (if applicable) from which the custom item is sold. Used for tax
     * calculations. A default location will be chosen automatically if none is provided.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The unit price of the custom item. This value can't be negative.
     */
    public Builder price(MoneyInput price) {
      this.price = price;
      this.fieldsSet.add("price");
      return this;
    }

    /**
     * The quantity of the custom item. This value must be greater than zero.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      this.fieldsSet.add("quantity");
      return this;
    }

    /**
     * Whether the custom item is taxable. Defaults to `true`.
     */
    public Builder taxable(Boolean taxable) {
      this.taxable = taxable;
      this.fieldsSet.add("taxable");
      return this;
    }

    /**
     * Whether the custom item requires shipping. Defaults to `false`.
     */
    public Builder requiresShipping(Boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      this.fieldsSet.add("requiresShipping");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
