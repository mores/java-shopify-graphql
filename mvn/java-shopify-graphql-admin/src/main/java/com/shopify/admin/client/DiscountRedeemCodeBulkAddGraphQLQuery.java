package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DiscountRedeemCodeInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Asynchronously add
 * [discount codes](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
 * in bulk that customers can use to redeem a discount. You can use the `discountRedeemCodeBulkAdd` mutation
 * to automate the distribution of discount codes through emails or other
 * marketing channels.
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

  public DiscountRedeemCodeBulkAddGraphQLQuery(String discountId,
      List<DiscountRedeemCodeInput> codes, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (discountId != null || fieldsSet.contains("discountId")) {
        getInput().put("discountId", discountId);
    }if (codes != null || fieldsSet.contains("codes")) {
        getInput().put("codes", codes);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String discountId;

    private List<DiscountRedeemCodeInput> codes;

    private String queryName;

    public DiscountRedeemCodeBulkAddGraphQLQuery build() {
      return new DiscountRedeemCodeBulkAddGraphQLQuery(discountId, codes, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the
     * [`DiscountCodeNode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeNode#field-id)
     * object that the codes will be added to. For example, `gid://shopify/DiscountCodeNode/123`.
     * You can use the
     * [`codeDiscountNodes` query](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes)
     * to retrieve the ID.
     */
    public Builder discountId(String discountId) {
      this.discountId = discountId;
      this.fieldsSet.add("discountId");
      return this;
    }

    /**
     * The ID of the
     * [`DiscountCodeNode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeNode#field-id)
     * object that the codes will be added to. For example, `gid://shopify/DiscountCodeNode/123`.
     * You can use the
     * [`codeDiscountNodes` query](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes)
     * to retrieve the ID.
     */
    public Builder discountIdReference(String variableRef) {
      this.variableReferences.put("discountId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("discountId");
      return this;
    }

    /**
     * The list of codes to associate with the
     * [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
     * Maximum: 250 codes.
     */
    public Builder codes(List<DiscountRedeemCodeInput> codes) {
      this.codes = codes;
      this.fieldsSet.add("codes");
      return this;
    }

    /**
     * The list of codes to associate with the
     * [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
     * Maximum: 250 codes.
     */
    public Builder codesReference(String variableRef) {
      this.variableReferences.put("codes", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("DiscountRedeemCodeInput"))))).build());
      this.fieldsSet.add("codes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
