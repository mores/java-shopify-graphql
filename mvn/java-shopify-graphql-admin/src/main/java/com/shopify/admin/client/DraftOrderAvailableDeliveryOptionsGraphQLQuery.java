package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DraftOrderAvailableDeliveryOptionsInput;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of available delivery options for a draft order.
 */
public class DraftOrderAvailableDeliveryOptionsGraphQLQuery extends GraphQLQuery {
  public DraftOrderAvailableDeliveryOptionsGraphQLQuery(
      DraftOrderAvailableDeliveryOptionsInput input, String search, Integer localPickupFrom,
      Integer localPickupCount, String sessionToken, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (localPickupFrom != null || fieldsSet.contains("localPickupFrom")) {
        getInput().put("localPickupFrom", localPickupFrom);
    }if (localPickupCount != null || fieldsSet.contains("localPickupCount")) {
        getInput().put("localPickupCount", localPickupCount);
    }if (sessionToken != null || fieldsSet.contains("sessionToken")) {
        getInput().put("sessionToken", sessionToken);
    }
  }

  public DraftOrderAvailableDeliveryOptionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "draftOrderAvailableDeliveryOptions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DraftOrderAvailableDeliveryOptionsInput input;

    private String search;

    private Integer localPickupFrom;

    private Integer localPickupCount;

    private String sessionToken;

    private String queryName;

    public DraftOrderAvailableDeliveryOptionsGraphQLQuery build() {
      return new DraftOrderAvailableDeliveryOptionsGraphQLQuery(input, search, localPickupFrom, localPickupCount, sessionToken, queryName, fieldsSet);
               
    }

    /**
     * The fields for the draft order.
     */
    public Builder input(DraftOrderAvailableDeliveryOptionsInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The search term for the delivery options.
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The offset for the local pickup options.
     */
    public Builder localPickupFrom(Integer localPickupFrom) {
      this.localPickupFrom = localPickupFrom;
      this.fieldsSet.add("localPickupFrom");
      return this;
    }

    /**
     * The number of local pickup options required.
     */
    public Builder localPickupCount(Integer localPickupCount) {
      this.localPickupCount = localPickupCount;
      this.fieldsSet.add("localPickupCount");
      return this;
    }

    /**
     * Unique token used to trace execution and help optimize the calculation.
     */
    public Builder sessionToken(String sessionToken) {
      this.sessionToken = sessionToken;
      this.fieldsSet.add("sessionToken");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
