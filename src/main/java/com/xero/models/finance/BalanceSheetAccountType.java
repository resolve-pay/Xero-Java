/*
 * Xero Finance API
 * The Finance API is a collection of endpoints which customers can use in the course of a loan application, which may assist lenders to gain the confidence they need to provide capital.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** BalanceSheetAccountType */
public class BalanceSheetAccountType {
  StringUtil util = new StringUtil();

  @JsonProperty("accountType")
  private String accountType;

  @JsonProperty("accounts")
  private List<BalanceSheetAccountDetail> accounts = new ArrayList<BalanceSheetAccountDetail>();

  @JsonProperty("total")
  private Double total;
  /**
   * The type of the account. See &lt;a
   * href&#x3D;&#39;https://developer.xero.com/documentation/api/types#AccountTypes&#39;&gt;Account
   * Types&lt;/a&gt;
   *
   * @param accountType String
   * @return BalanceSheetAccountType
   */
  public BalanceSheetAccountType accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * The type of the account. See &lt;a
   * href&#x3D;&#39;https://developer.xero.com/documentation/api/types#AccountTypes&#39;&gt;Account
   * Types&lt;/a&gt;
   *
   * @return accountType
   */
  @ApiModelProperty(
      value =
          "The type of the account. See <a"
              + " href='https://developer.xero.com/documentation/api/types#AccountTypes'>Account"
              + " Types</a>")
  /**
   * The type of the account. See &lt;a
   * href&#x3D;&#39;https://developer.xero.com/documentation/api/types#AccountTypes&#39;&gt;Account
   * Types&lt;/a&gt;
   *
   * @return accountType String
   */
  public String getAccountType() {
    return accountType;
  }

  /**
   * The type of the account. See &lt;a
   * href&#x3D;&#39;https://developer.xero.com/documentation/api/types#AccountTypes&#39;&gt;Account
   * Types&lt;/a&gt;
   *
   * @param accountType String
   */
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  /**
   * A list of all accounts of this type. Refer to the Account section below for each account
   * element detail.
   *
   * @param accounts List&lt;BalanceSheetAccountDetail&gt;
   * @return BalanceSheetAccountType
   */
  public BalanceSheetAccountType accounts(List<BalanceSheetAccountDetail> accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * A list of all accounts of this type. Refer to the Account section below for each account
   * element detail.
   *
   * @param accountsItem BalanceSheetAccountDetail
   * @return BalanceSheetAccountType
   */
  public BalanceSheetAccountType addAccountsItem(BalanceSheetAccountDetail accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<BalanceSheetAccountDetail>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * A list of all accounts of this type. Refer to the Account section below for each account
   * element detail.
   *
   * @return accounts
   */
  @ApiModelProperty(
      value =
          "A list of all accounts of this type. Refer to the Account section below for each"
              + " account element detail.")
  /**
   * A list of all accounts of this type. Refer to the Account section below for each account
   * element detail.
   *
   * @return accounts List<BalanceSheetAccountDetail>
   */
  public List<BalanceSheetAccountDetail> getAccounts() {
    return accounts;
  }

  /**
   * A list of all accounts of this type. Refer to the Account section below for each account
   * element detail.
   *
   * @param accounts List&lt;BalanceSheetAccountDetail&gt;
   */
  public void setAccounts(List<BalanceSheetAccountDetail> accounts) {
    this.accounts = accounts;
  }

  /**
   * Total value of all the accounts in this type
   *
   * @param total Double
   * @return BalanceSheetAccountType
   */
  public BalanceSheetAccountType total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Total value of all the accounts in this type
   *
   * @return total
   */
  @ApiModelProperty(value = "Total value of all the accounts in this type")
  /**
   * Total value of all the accounts in this type
   *
   * @return total Double
   */
  public Double getTotal() {
    return total;
  }

  /**
   * Total value of all the accounts in this type
   *
   * @param total Double
   */
  public void setTotal(Double total) {
    this.total = total;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceSheetAccountType balanceSheetAccountType = (BalanceSheetAccountType) o;
    return Objects.equals(this.accountType, balanceSheetAccountType.accountType)
        && Objects.equals(this.accounts, balanceSheetAccountType.accounts)
        && Objects.equals(this.total, balanceSheetAccountType.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, accounts, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceSheetAccountType {\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}