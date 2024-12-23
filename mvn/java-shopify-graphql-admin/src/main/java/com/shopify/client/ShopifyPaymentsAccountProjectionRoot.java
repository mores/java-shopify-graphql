package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.BalanceTransactionSortKeys;
import com.shopify.types.PayoutSortKeys;
import com.shopify.types.ShopifyPaymentsPayoutTransactionType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ShopifyPaymentsAccountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsAccountProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopifyPaymentsAccount"));
  }

  public ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> balance(
      ) {
    MoneyV2Projection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("balance", projection);
    return projection;
  }

  public ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> balanceTransactions(
      ) {
    ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsBalanceTransactionConnectionProjection<>(this, this);    
    getFields().put("balanceTransactions", projection);
    return projection;
  }

  public ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> balanceTransactions(
      Boolean hideTransfers, Integer first, String after, Integer last, String before,
      Boolean reverse, BalanceTransactionSortKeys sortKey, String query, String savedSearchId) {
    ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsBalanceTransactionConnectionProjection<>(this, this);    
    getFields().put("balanceTransactions", projection);
    getInputArguments().computeIfAbsent("balanceTransactions", k -> new ArrayList<>());                      
    InputArgument hideTransfersArg = new InputArgument("hideTransfers", hideTransfers);
    getInputArguments().get("balanceTransactions").add(hideTransfersArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("balanceTransactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("balanceTransactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("balanceTransactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("balanceTransactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("balanceTransactions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("balanceTransactions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("balanceTransactions").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("balanceTransactions").add(savedSearchIdArg);
    return projection;
  }

  public ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> bankAccounts(
      ) {
    ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsBankAccountConnectionProjection<>(this, this);    
    getFields().put("bankAccounts", projection);
    return projection;
  }

  public ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> bankAccounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsBankAccountConnectionProjection<>(this, this);    
    getFields().put("bankAccounts", projection);
    getInputArguments().computeIfAbsent("bankAccounts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("bankAccounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("bankAccounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("bankAccounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("bankAccounts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("bankAccounts").add(reverseArg);
    return projection;
  }

  public ShopifyPaymentsChargeStatementDescriptorProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> chargeStatementDescriptors(
      ) {
    ShopifyPaymentsChargeStatementDescriptorProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsChargeStatementDescriptorProjection<>(this, this);    
    getFields().put("chargeStatementDescriptors", projection);
    return projection;
  }

  public CurrencyCodeProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> defaultCurrency(
      ) {
    CurrencyCodeProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("defaultCurrency", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> disputes(
      ) {
    ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeConnectionProjection<>(this, this);    
    getFields().put("disputes", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> disputes(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeConnectionProjection<>(this, this);    
    getFields().put("disputes", projection);
    getInputArguments().computeIfAbsent("disputes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("disputes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("disputes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("disputes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("disputes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("disputes").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("disputes").add(queryArg);
    return projection;
  }

  public ShopifyPaymentsPayoutScheduleProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> payoutSchedule(
      ) {
    ShopifyPaymentsPayoutScheduleProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsPayoutScheduleProjection<>(this, this);    
    getFields().put("payoutSchedule", projection);
    return projection;
  }

  public ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> payouts(
      ) {
    ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsPayoutConnectionProjection<>(this, this);    
    getFields().put("payouts", projection);
    return projection;
  }

  public ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> payouts(
      ShopifyPaymentsPayoutTransactionType transactionType, Integer first, String after,
      Integer last, String before, Boolean reverse, PayoutSortKeys sortKey, String query,
      String savedSearchId) {
    ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>, ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsPayoutConnectionProjection<>(this, this);    
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

  public ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT> activated() {
    getFields().put("activated", null);
    return this;
  }

  public ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT> chargeStatementDescriptor() {
    getFields().put("chargeStatementDescriptor", null);
    return this;
  }

  public ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT> onboardable() {
    getFields().put("onboardable", null);
    return this;
  }

  public ShopifyPaymentsAccountProjectionRoot<PARENT, ROOT> payoutStatementDescriptor() {
    getFields().put("payoutStatementDescriptor", null);
    return this;
  }
}
