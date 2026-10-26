package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.GiftCardProductSetInput;
import com.shopify.admin.types.ProductSetIdentifiers;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates or updates a
 * [`gift card`](https://shopify.dev/docs/api/admin-graphql/latest/objects/GiftCard)
 * product. This mutation is specifically designed for gift card products and automatically sets
 * the `giftCard` field to `true`, applies gift card variant defaults (non-taxable, no shipping
 * required, inventory untracked), and omits fields that aren't relevant to gift cards.
 *   
 * For list fields like
 * [`variants`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/giftCardProductSet#arguments-input.fields.variants),
 * the mutation performs a full replacement: it creates new entries, updates existing ones, and
 * removes any entries not included in the input. For all other fields, only included fields
 * change and omitted fields remain unchanged.
 *   
 * You can run the mutation synchronously to receive the updated product immediately, or
 * asynchronously by setting
 * [`synchronous`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/giftCardProductSet#arguments-synchronous)`: false`
 * to receive a
 * [`ProductSetOperation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductSetOperation)
 * object instead. Use the
 * [`productOperation`](https://shopify.dev/docs/api/admin-graphql/latest/queries/productOperation)
 * query to check the status and retrieve the product details when running asynchronously.
 *   
 * > Note:
 * > The
 * [`issuanceCurrency`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/giftCardProductSet#arguments-input.fields.issuanceCurrency)
 * and [`crossCurrencyRedeemable`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/giftCardProductSet#arguments-input.fields.crossCurrencyRedeemable) fields can only be set during product creation. They can't be changed after
 * the product is created.
 */
public class GiftCardProductSetGraphQLQuery extends GraphQLQuery {
  public GiftCardProductSetGraphQLQuery(GiftCardProductSetInput input, Boolean synchronous,
      ProductSetIdentifiers identifier, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (synchronous != null || fieldsSet.contains("synchronous")) {
        getInput().put("synchronous", synchronous);
    }if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public GiftCardProductSetGraphQLQuery(GiftCardProductSetInput input, Boolean synchronous,
      ProductSetIdentifiers identifier, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (synchronous != null || fieldsSet.contains("synchronous")) {
        getInput().put("synchronous", synchronous);
    }if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public GiftCardProductSetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "giftCardProductSet";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private GiftCardProductSetInput input;

    private Boolean synchronous;

    private ProductSetIdentifiers identifier;

    private String queryName;

    public GiftCardProductSetGraphQLQuery build() {
      return new GiftCardProductSetGraphQLQuery(input, synchronous, identifier, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The properties of the gift card product to create or update.
     */
    public Builder input(GiftCardProductSetInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The properties of the gift card product to create or update.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("GiftCardProductSetInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * Whether the mutation should be run synchronously or asynchronously.
     *     
     * If `true`, the mutation will return the updated `product`.
     * If `false`, the mutation will return a `productSetOperation`.
     *     
     * Defaults to `true`.
     */
    public Builder synchronous(Boolean synchronous) {
      this.synchronous = synchronous;
      this.fieldsSet.add("synchronous");
      return this;
    }

    /**
     * Whether the mutation should be run synchronously or asynchronously.
     *     
     * If `true`, the mutation will return the updated `product`.
     * If `false`, the mutation will return a `productSetOperation`.
     *     
     * Defaults to `true`.
     */
    public Builder synchronousReference(String variableRef) {
      this.variableReferences.put("synchronous", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("synchronous");
      return this;
    }

    /**
     * Specifies the identifier that will be used to lookup the resource.
     */
    public Builder identifier(ProductSetIdentifiers identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    /**
     * Specifies the identifier that will be used to lookup the resource.
     */
    public Builder identifierReference(String variableRef) {
      this.variableReferences.put("identifier", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ProductSetIdentifiers")).build());
      this.fieldsSet.add("identifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
