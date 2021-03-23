package barracksWars.core.factories;

import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import barracksWars.models.units.*;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType)  {
		Unit unit = null;
		try {
			Class<?> clazz = Class.forName(UNITS_PACKAGE_NAME + unitType);
			unit = (Unit) clazz.getDeclaredConstructor().newInstance();


		} catch (ClassNotFoundException
				| NoSuchMethodException 
				| IllegalAccessException 
				| InstantiationException 
				| InvocationTargetException e) {
			e.printStackTrace();
		}


		return unit;
	}
}