package com.coamctech.xlsunit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFColor;

public class RowHibernateOutputHolder extends  RowJPAOutputHolder {
	

	public RowHibernateOutputHolder(XLSParser parser, VariableTable vars, String sheetName) {
		super(parser,vars,sheetName);
	}

	

	

}
