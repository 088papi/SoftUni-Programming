package p06_TirePressureMonitoringSystem;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class testAlarm {

    @Test
    public void when_pressureLowerThanLowPressureThreshold_then_alarmShouldBeOn() {
        Sensor sensor = Mockito.mock(Sensor.class);

        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(15.5);

        Alarm alarm = new Alarm(sensor);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void when_pressureGreaterThanHighPressureThreshold_then_alarmShouldBeOn(){
        Sensor sensor = Mockito.mock(Sensor.class);

        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(125.5);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void when_normalPressure_thenAlarmShouldBeOff(){
        Sensor sensor = Mockito.mock(Sensor.class);

        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(19.0);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        Assert.assertFalse(alarm.getAlarmOn());
    }
}
