package com.xero.api.client;

import static org.junit.Assert.assertTrue;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

import com.xero.api.ApiClient;
import com.xero.api.client.*;
import com.xero.models.payrolluk.*;

import java.io.File;
import java.net.URL;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

import org.threeten.bp.*;
import java.io.IOException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import java.util.Calendar;
import java.util.Map;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class PayrollUkApiEmployeeLeaveTypesTest {

	ApiClient defaultClient; 
    PayrollUkApi payrollUkApi;
     
	String accessToken;
    String xeroTenantId; 
	
	@Before
	public void setUp() {
		// Set Access Token and Tenant Id
        accessToken = "123";
        xeroTenantId = "xyz";
        
        // Init projectApi client
        // NEW Sandbox for API Mocking
		defaultClient = new ApiClient("https://xero-payroll-uk.getsandbox.com:443/payroll.xro/2.0",null,null,null,null);
        payrollUkApi = PayrollUkApi.getInstance(defaultClient);   
       
	}

	public void tearDown() {
		payrollUkApi = null;
        defaultClient = null;
	}

    @Test
    public void getEmployeeLeaveTypesTest() throws IOException {
        System.out.println("@Test UK Payroll - getEmployeeLeaveTypesTest");
        
        UUID employeeId = UUID.fromString("cdfb8371-0b21-4b8a-8903-1024df6c391e");
        LocalDate startDate = LocalDate.of(2020, Month.MARCH, 30);
        LocalDate endDate = LocalDate.of(2020, Month.MARCH, 30);
        EmployeeLeaveTypes response = payrollUkApi.getEmployeeLeaveTypes(accessToken, xeroTenantId, employeeId);
        
        assertThat(response.getLeaveTypes().get(0).getLeaveTypeID(), is(equalTo(UUID.fromString("ed08dffe-788e-4b24-9630-f0fa2f4d164c"))));
        assertThat(response.getLeaveTypes().get(0).getScheduleOfAccrual(), is(equalTo(com.xero.models.payrolluk.EmployeeLeaveType.ScheduleOfAccrualEnum.ONANNIVERSARYDATE)));
        assertThat(response.getLeaveTypes().get(0).getHoursAccruedAnnually(), is(equalTo(200.0)));
        assertThat(response.getLeaveTypes().get(0).getMaximumToAccrue(), is(equalTo(0.0)));
        assertThat(response.getLeaveTypes().get(0).getOpeningBalance(), is(equalTo(72.0)));
        assertThat(response.getLeaveTypes().get(0).getRateAccruedHourly(), is(equalTo(0.0)));

        //System.out.println(response.toString());
    }

    @Test
    public void createEmployeeLeaveTypesTest() throws IOException {
        System.out.println("@Test UK Payroll - createEmployeeLeaveTypesTest");
        
        UUID employeeId = UUID.fromString("cdfb8371-0b21-4b8a-8903-1024df6c391e");
        EmployeeLeaveType employeeLeaveType  = new EmployeeLeaveType();
        EmployeeLeaveTypeObject response = payrollUkApi.createEmployeeLeaveType(accessToken, xeroTenantId, employeeId, employeeLeaveType);
        
        assertThat(response.getLeaveType().getLeaveTypeID(), is(equalTo(UUID.fromString("4918f233-bd31-43f9-9633-bcc6de1178f2"))));
        assertThat(response.getLeaveType().getScheduleOfAccrual(), is(equalTo(com.xero.models.payrolluk.EmployeeLeaveType.ScheduleOfAccrualEnum.BEGINNINGOFCALENDARYEAR)));
        assertThat(response.getLeaveType().getHoursAccruedAnnually(), is(equalTo(10.0)));
        assertThat(response.getLeaveType().getMaximumToAccrue(), is(equalTo(0.0)));
        assertThat(response.getLeaveType().getOpeningBalance(), is(equalTo(0.0)));
        assertThat(response.getLeaveType().getRateAccruedHourly(), is(equalTo(0.0)));

        //System.out.println(response.toString());
    }
}
