package kata3;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute() {
        setVisible(true);
    }
    
    private JPanel createPanel() {
        ChartPanel chartpanel = new ChartPanel (createChart(createDataset()));
        return chartpanel;
    }
    
    private JFreeChart createChart (DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart(
                "JFreeChart Histogram",
                "Dominios email",
                "Nº de emails",
                dataSet,
                PlotOrientation.VERTICAL, 
                false, 
                rootPaneCheckingEnabled, 
                rootPaneCheckingEnabled);
                return chart;
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(5, "", "gmail.com");
        dataSet.addValue(5, "", "ulpgc.es");
        dataSet.addValue(5, "", "ull.es");
        dataSet.addValue(5, "", "hotmail.com");
        return dataSet;        
    }
}
