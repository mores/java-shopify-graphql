package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ShopLocaleInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a locale for a shop.
 */
public class ShopLocaleUpdateGraphQLQuery extends GraphQLQuery {
  public ShopLocaleUpdateGraphQLQuery(String locale, ShopLocaleInput shopLocale, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locale != null || fieldsSet.contains("locale")) {
        getInput().put("locale", locale);
    }if (shopLocale != null || fieldsSet.contains("shopLocale")) {
        getInput().put("shopLocale", shopLocale);
    }
  }

  public ShopLocaleUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopLocaleUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String locale;

    private ShopLocaleInput shopLocale;

    private String queryName;

    public ShopLocaleUpdateGraphQLQuery build() {
      return new ShopLocaleUpdateGraphQLQuery(locale, shopLocale, queryName, fieldsSet);
               
    }

    /**
     * ISO code of the locale to update.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      this.fieldsSet.add("locale");
      return this;
    }

    /**
     * Specifies the input fields for a shop locale.
     */
    public Builder shopLocale(ShopLocaleInput shopLocale) {
      this.shopLocale = shopLocale;
      this.fieldsSet.add("shopLocale");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
