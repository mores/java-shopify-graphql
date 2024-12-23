package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.PayoutSortKeys;
import com.shopify.types.ShopifyPaymentsPayoutTransactionType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ShopifyPaymentsBankAccountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsBankAccountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsBankAccount"));
  }

  public ShopifyPaymentsBankAccountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<ShopifyPaymentsBankAccountProjection<PARENT, ROOT>, ROOT> country() {
     CountryCodeProjection<ShopifyPaymentsBankAccountProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("country", projection);
     return projection;
  }

  public CurrencyCodeProjection<ShopifyPaymentsBankAccountProjection<PARENT, ROOT>, ROOT> currency(
      ) {
     CurrencyCodeProjection<ShopifyPaymentsBankAccountProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currency", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsBankAccountProjection<PARENT, ROOT>, ROOT> payouts(
      ) {
     ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsBankAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutConnectionProjection<>(this, getRoot());
     getFields().put("payouts", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsBankAccountProjection<PARENT, ROOT>, ROOT> payouts(
      ShopifyPaymentsPayoutTransactionType transactionType, Integer first, String after,
      Integer last, String before, Boolean reverse, PayoutSortKeys sortKey, String query,
      String savedSearchId) {
    ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsBankAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutConnectionProjection<>(this, getRoot());    
    getFields().put("payouts", projection);
    getInputArguments().computeIfAbsent("payouts", k -> new ArrayList<>());                      
    InputArgument transactionTypeArg = new InputArgument("transactionType", transactionType);
    getInputArguments().get("payouts").add(transactionTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("payouts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("payouts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("payouts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("payouts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("payouts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("payouts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("payouts").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("payouts").add(savedSearchIdArg);
    return projection;
  }

  public ShopifyPaymentsBankAccountStatusProjection<ShopifyPaymentsBankAccountProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ShopifyPaymentsBankAccountStatusProjection<ShopifyPaymentsBankAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ShopifyPaymentsBankAccountProjection<PARENT, ROOT> accountNumber() {
    getFields().put("accountNumber", null);
    return this;
  }

  public ShopifyPaymentsBankAccountProjection<PARENT, ROOT> accountNumberLastDigits() {
    getFields().put("accountNumberLastDigits", null);
    return this;
  }

  public ShopifyPaymentsBankAccountProjection<PARENT, ROOT> bankName() {
    getFields().put("bankName", null);
    return this;
  }

  public ShopifyPaymentsBankAccountProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ShopifyPaymentsBankAccountProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsBankAccountProjection<PARENT, ROOT> routingNumber() {
    getFields().put("routingNumber", null);
    return this;
  }
}
