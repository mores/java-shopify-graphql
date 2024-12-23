package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountRedeemCodeInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Asynchronously add discount redeem codes in bulk. Specify the codes to add
 * and the discount code ID that the codes will belong to.
 */
public class DiscountRedeemCodeBulkAddGraphQLQuery extends GraphQLQuery {
  public DiscountRedeemCodeBulkAddGraphQLQuery(String discountId,
      List<DiscountRedeemCodeInput> codes, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (discountId != null || fieldsSet.contains("discountId")) {
        getInput().put("discountId", discountId);
    }if (codes != null || fieldsSet.contains("codes")) {
        getInput().put("codes", codes);
    }
  }

  public DiscountRedeemCodeBulkAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountRedeemCodeBulkAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String discountId;

    private List<DiscountRedeemCodeInput> codes;

    private String queryName;

    public DiscountRedeemCodeBulkAddGraphQLQuery build() {
      return new DiscountRedeemCodeBulkAddGraphQLQuery(discountId, codes, queryName, fieldsSet);
               
    }

    /**
     * The ID of the code discount that the codes will be added to.
     */
    public Builder discountId(String discountId) {
      this.discountId = discountId;
      this.fieldsSet.add("discountId");
      return this;
    }

    /**
     * The list of codes that will be added to the code discount. Maximum 100 codes permitted.
     */
    public Builder codes(List<DiscountRedeemCodeInput> codes) {
      this.codes = codes;
      this.fieldsSet.add("codes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
