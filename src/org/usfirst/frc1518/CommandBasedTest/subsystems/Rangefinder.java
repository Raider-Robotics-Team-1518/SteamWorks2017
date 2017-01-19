package org.usfirst.frc1518.CommandBasedTest.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;
import edu.wpi.first.wpilibj.tables.ITable;

public class Rangefinder extends SensorBase implements LiveWindowSendable {

	private final double IN_TO_CM_CONVERSION = 2.54;
	private boolean use_units; // Are we using units or just returning voltage?
	private double min_voltage; // Minimum voltage the ultrasonic sensor can
								// return
	private double voltage_range; // The range of the voltages returned by the
									// sensor (maximum - minimum)
	private double min_distance; // Minimum distance the ultrasonic sensor can
									// return in inches
	private double distance_range;// The range of the distances returned by this
									// class in inches (maximum - minimum)
	AnalogInput channel;

	// constructor
	public Rangefinder(int _channel) {
		channel = new AnalogInput(_channel);
		// default values
		use_units = true;
		min_voltage = .5;
		voltage_range = 5.0 - min_voltage;
		min_distance = 3.0;
		distance_range = 120.0 - min_distance;
	}

	// constructor
	public Rangefinder(int _channel, boolean _use_units, double _min_voltage, double _max_voltage, double _min_distance,
			double _max_distance) {
		channel = new AnalogInput(_channel);
		channel.setAverageBits(2);

		// only use unit-specific variables if we're using units
		if (_use_units) {
			use_units = true;
			min_voltage = _min_voltage;
			voltage_range = _max_voltage - _min_voltage;
			min_distance = _min_distance;
			distance_range = _max_distance - _min_distance;
		}
	}

	// Just get the voltage.
	double GetVoltage() {
		return channel.getVoltage();
	}
	/*
	 * GetRangeInInches Returns the range in inches Returns -1.0 if units are
	 * not being used Returns -2.0 if the voltage is below the minimum voltage
	 */

	public double GetRangeInInches() {
		double range;
		// if we're not using units, return -1, a range that will most likely
		// never be returned
		if (!use_units) {
			return -1.0;
		}
		range = channel.getAverageVoltage();
		if (range < min_voltage) {
			return -2.0;
		}
		// first, normalize the voltage
		range = (range - min_voltage) / voltage_range;
		// next, denormalize to the unit range
		range = (range * distance_range) + min_distance;
		return range;
	}
	/*
	 * GetRangeInCM Returns the range in centimeters Returns -1.0 if units are
	 * not being used Returns -2.0 if the voltage is below the minimum voltage
	 */

	double GetRangeInCM() {
		double range;
		// if we're not using units, return -1, a range that will most likely
		// never be returned
		if (!use_units) {
			return -1.0;
		}
		range = channel.getVoltage();
		if (range < min_voltage) {
			return -2.0;
		}
		// first, normalize the voltage
		range = (range - min_voltage) / voltage_range;
		// next, denormalize to the unit range
		range = (range * distance_range) + min_distance;
		// finally, convert to centimeters
		range *= IN_TO_CM_CONVERSION;
		return range;
	}

	@Override
	public void initTable(ITable subtable) {
		// TODO Auto-generated method stub

	}

	@Override
	public ITable getTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSmartDashboardType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void startLiveWindowMode() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopLiveWindowMode() {
		// TODO Auto-generated method stub

	}
}
