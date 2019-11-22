package com.saartha.iot.codegeneration;  import org.slf4j.Logger; import org.slf4j.LoggerFactory; import org.springframework.stereotype.Component; import com.saartha.iot.common.IRuleConfigurationData;  import com.saartha.iot.common.ITriggerRuleListener; import com.saartha.iot.common.ITriggerRuleProcessor; import java.util.List; import java.util.ArrayList;  @Component public class TriggerRule implements ITriggerRuleProcessor {  private static final Logger LOGGER = LoggerFactory.getLogger(TriggerRule.class); public void process( IRuleConfigurationData contextData, ITriggerRuleListener datasender) throws Exception { LOGGER.info("Trace for Function 'ZZ_COMPRESSOR_MAINTENANCE_RULE' started."); ContextData context = (ContextData) contextData; ZZ_COMPRESSOR_MAINTENANCE_RULE codeGen = new ZZ_COMPRESSOR_MAINTENANCE_RULE(); codeGen.initializeContext(context); codeGen.addListener(datasender); codeGen.process_fun_ZZ_COMPRESSOR_MAINTENANCE_RULE(); LOGGER.info("Trace for Function 'ZZ_COMPRESSOR_MAINTENANCE_RULE' finished."); } @Override public String getRule(){ return "5254006E0D6E1EE9B7D90A8DB7A47BE5"; } }  class ZZ_COMPRESSOR_MAINTENANCE_RULE{  private static final Logger LOGGER = LoggerFactory.getLogger(ZZ_COMPRESSOR_MAINTENANCE_RULE.class);  double par_AVAILABILITY = 0; String  par_MANUFACTURER = ""; String  par_MODEL = ""; double par_Z_HUMIDITY_NUM = 0; double par_Z_TEMPERATURE_NUM = 0; String assetId = "";  private List<ITriggerRuleListener> listeners = new ArrayList<ITriggerRuleListener>();   public void addListener(ITriggerRuleListener triggerRuleListener) { listeners.add(triggerRuleListener); }  public void initializeContext(ContextData context) { LOGGER.info("Starting Context for Function 'ZZ_COMPRESSOR_MAINTENANCE_RULE' :" ); this.par_MODEL = context.getPar_MODEL(); LOGGER.info("MODEL = " + this.par_MODEL ); this.par_MANUFACTURER = context.getPar_MANUFACTURER(); LOGGER.info("MANUFACTURER = " + this.par_MANUFACTURER ); this.par_Z_TEMPERATURE_NUM = context.getPar_Z_TEMPERATURE_NUM(); LOGGER.info("Z_TEMPERATURE_NUM = " + this.par_Z_TEMPERATURE_NUM ); this.par_Z_HUMIDITY_NUM = context.getPar_Z_HUMIDITY_NUM(); LOGGER.info("Z_HUMIDITY_NUM = " + this.par_Z_HUMIDITY_NUM ); this.assetId = context.getAssetId(); } public void process_actcp_OLD_TRIGGER_MAINTENANCE_RULE( String ruleId, String identifier ) throws Exception{  LOGGER.info("Call Procedure Action 'OLD_TRIGGER_MAINTENANCE_RULE' started."); LOGGER.info(" Action Processing Rule : 'ZZ_MAINT_NOT_CREATE' "); this.triggerRuleAction(ruleId,identifier); LOGGER.info("Call Procedure Action 'OLD_TRIGGER_MAINTENANCE_RULE' finished."); }  public void process_actcp_ZZ_TRIGGER_QUALT_NOT_CREAT_RUL( String ruleId, String identifier ) throws Exception{  LOGGER.info("Call Procedure Action 'ZZ_TRIGGER_QUALT_NOT_CREAT_RUL' started."); LOGGER.info(" Action Processing Rule : 'ZZ_QUALTY_NOT_CREATE' "); this.triggerRuleAction(ruleId,identifier); LOGGER.info("Call Procedure Action 'ZZ_TRIGGER_QUALT_NOT_CREAT_RUL' finished."); }  public void process_dec_ZZ_WITH_IN_THRESHOLDS( )throws Exception{ LOGGER.info("Execution of Decision Table 'ZZ_WITH_IN_THRESHOLDS' started."); if ( ( this.par_MODEL.equals("001")) && ( this.par_MANUFACTURER.equals("MEG")) && ( this.par_Z_TEMPERATURE_NUM >= 10 &&this.par_Z_TEMPERATURE_NUM <= 30) && ( this.par_Z_HUMIDITY_NUM >= 10 &&this.par_Z_HUMIDITY_NUM <= 100) ){ LOGGER.info("All Conditions in Row 1 is met for given context. Evaluating Result of Row 1 ."); String identifier = "I2"; this.par_AVAILABILITY = 95; LOGGER.info( "Value change Data Object 'AVAILABILITY' = " + this.par_AVAILABILITY); this.process_actcp_OLD_TRIGGER_MAINTENANCE_RULE("5254006E0D6E1EE9BC8291A7113F9CAA" , identifier); return; } else { LOGGER.info("Row 1 Condition/s not met for given context. Skip Row."); } if ( ( this.par_MODEL.equals("001")) && ( this.par_MANUFACTURER.equals("MEG")) && ( this.par_Z_TEMPERATURE_NUM >= 30 &&this.par_Z_TEMPERATURE_NUM <= 50) && ( this.par_Z_HUMIDITY_NUM >= 100 &&this.par_Z_HUMIDITY_NUM <= 200) ){ LOGGER.info("All Conditions in Row 2 is met for given context. Evaluating Result of Row 2 ."); String identifier = "I3"; this.par_AVAILABILITY = 85; LOGGER.info( "Value change Data Object 'AVAILABILITY' = " + this.par_AVAILABILITY); this.process_actcp_ZZ_TRIGGER_QUALT_NOT_CREAT_RUL("5254006E0D6E1EE9B7D9440E0D83DC21" , identifier); return; } else { LOGGER.info("Row 2 Condition/s not met for given context. Skip Row."); } if ( ( this.par_MODEL.equals("002")) && ( this.par_MANUFACTURER.equals("MEG")) && ( this.par_Z_TEMPERATURE_NUM >= 10 &&this.par_Z_TEMPERATURE_NUM <= 30) && ( this.par_Z_HUMIDITY_NUM >= 10 &&this.par_Z_HUMIDITY_NUM <= 100) ){ LOGGER.info("All Conditions in Row 3 is met for given context. Evaluating Result of Row 3 ."); String identifier = "I4"; this.par_AVAILABILITY = 96; LOGGER.info( "Value change Data Object 'AVAILABILITY' = " + this.par_AVAILABILITY); this.process_actcp_OLD_TRIGGER_MAINTENANCE_RULE("5254006E0D6E1EE9BC8291A7113F9CAA" , identifier); return; } else { LOGGER.info("Row 3 Condition/s not met for given context. Skip Row."); } if ( ( this.par_MODEL.equals("002")) && ( this.par_MANUFACTURER.equals("MEG")) && ( this.par_Z_TEMPERATURE_NUM >= 30 &&this.par_Z_TEMPERATURE_NUM <= 50) && ( this.par_Z_HUMIDITY_NUM >= 100 &&this.par_Z_HUMIDITY_NUM <= 200) ){ LOGGER.info("All Conditions in Row 4 is met for given context. Evaluating Result of Row 4 ."); String identifier = "I5"; this.par_AVAILABILITY = 88; LOGGER.info( "Value change Data Object 'AVAILABILITY' = " + this.par_AVAILABILITY); this.process_actcp_ZZ_TRIGGER_QUALT_NOT_CREAT_RUL("5254006E0D6E1EE9B7D9440E0D83DC21" , identifier); return; } else { LOGGER.info("Row 4 Condition/s not met for given context. Skip Row."); } if ( ( this.par_MODEL.equals("003")) && ( this.par_MANUFACTURER.equals("MEG")) && ( this.par_Z_TEMPERATURE_NUM >= 10 &&this.par_Z_TEMPERATURE_NUM <= 30) && ( this.par_Z_HUMIDITY_NUM >= 10 &&this.par_Z_HUMIDITY_NUM <= 100) ){ LOGGER.info("All Conditions in Row 5 is met for given context. Evaluating Result of Row 5 ."); String identifier = "I6"; this.par_AVAILABILITY = 100; LOGGER.info( "Value change Data Object 'AVAILABILITY' = " + this.par_AVAILABILITY); this.process_actcp_OLD_TRIGGER_MAINTENANCE_RULE("5254006E0D6E1EE9BC8291A7113F9CAA" , identifier); return; } else { LOGGER.info("Row 5 Condition/s not met for given context. Skip Row."); } if ( ( this.par_MODEL.equals("003")) && ( this.par_MANUFACTURER.equals("MEG")) && ( this.par_Z_TEMPERATURE_NUM >= 30 &&this.par_Z_TEMPERATURE_NUM <= 50) && ( this.par_Z_HUMIDITY_NUM >= 100 &&this.par_Z_HUMIDITY_NUM <= 200) ){ LOGGER.info("All Conditions in Row 6 is met for given context. Evaluating Result of Row 6 ."); String identifier = "I7"; this.par_AVAILABILITY = 90; LOGGER.info( "Value change Data Object 'AVAILABILITY' = " + this.par_AVAILABILITY); this.process_actcp_ZZ_TRIGGER_QUALT_NOT_CREAT_RUL("5254006E0D6E1EE9B7D9440E0D83DC21" , identifier); return; } else { LOGGER.info("Row 6 Condition/s not met for given context. Skip Row."); } LOGGER.info("Execution of Decision Table 'ZZ_WITH_IN_THRESHOLDS' finished."); }  public void process_actcp_ZZ_TRIGGER_WO_CREAT_RULE( String ruleId, String identifier ) throws Exception{  LOGGER.info("Call Procedure Action 'ZZ_TRIGGER_WO_CREAT_RULE' started."); LOGGER.info(" Action Processing Rule : 'ZZ_WORK_ORDER_CREATE' "); this.triggerRuleAction(ruleId,identifier); LOGGER.info("Call Procedure Action 'ZZ_TRIGGER_WO_CREAT_RULE' finished."); }  public void process_rule_ZZ_TEMPERATURE_NOT_IN_RANGE( )throws Exception{ LOGGER.info("Execution of Rule 'ZZ_TEMPERATURE_NOT_IN_RANGE' started."); String identifier = "I8"; if ( ( this.par_Z_TEMPERATURE_NUM > 50) ){ LOGGER.info("User Defined Condition evaluated to True. Condition fulfilled, triggering True action(s)"); this.process_actcp_ZZ_TRIGGER_WO_CREAT_RULE("5254006E0D6E1EE9B7D94FE19B0A9C28" , identifier); } else { LOGGER.info("User Defined Condition evaluated to False. Condition not fulfilled"); } LOGGER.info("Execution of Rule 'ZZ_TEMPERATURE_NOT_IN_RANGE' finished."); }  public void process_rule_ZZ_HUMIDITY_NOT_IN_RANGE( )throws Exception{ LOGGER.info("Execution of Rule 'ZZ_HUMIDITY_NOT_IN_RANGE' started."); String identifier = "I9"; if ( ( this.par_Z_HUMIDITY_NUM > 200) ){ LOGGER.info("User Defined Condition evaluated to True. Condition fulfilled, triggering True action(s)"); this.process_actcp_ZZ_TRIGGER_WO_CREAT_RULE("5254006E0D6E1EE9B7D94FE19B0A9C28" , identifier); } else { LOGGER.info("User Defined Condition evaluated to False. Condition not fulfilled"); } LOGGER.info("Execution of Rule 'ZZ_HUMIDITY_NOT_IN_RANGE' finished."); }  public void process_fun_ZZ_COMPRESSOR_MAINTENANCE_RULE()throws Exception{ String identifier = "I1"; this.process_dec_ZZ_WITH_IN_THRESHOLDS( ); this.process_rule_ZZ_TEMPERATURE_NOT_IN_RANGE( ); this.process_rule_ZZ_HUMIDITY_NOT_IN_RANGE( ); }   public void triggerRuleAction( String ruleId, String identifier ){ for (ITriggerRuleListener triggerClassess : listeners) { triggerClassess.onActionRuleTriggered(ruleId,this.assetId,identifier); } }   }