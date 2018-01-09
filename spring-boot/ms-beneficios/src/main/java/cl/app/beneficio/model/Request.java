package cl.app.beneficio.model;

/**
 * 
 * @author VictorFernandezBriones
 *
 */
public class Request {
	
	private Context context;
	private Benefit benefit;
	/**
	 * @return the context
	 */
	public Context getContext() {
		return context;
	}
	/**
	 * @param context the context to set
	 */
	public void setContext(Context context) {
		this.context = context;
	}
	/**
	 * @return the benefit
	 */
	public Benefit getBenefit() {
		return benefit;
	}
	/**
	 * @param benefit the benefit to set
	 */
	public void setBenefit(Benefit benefit) {
		this.benefit = benefit;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Request [context=" + context + ", benefit=" + benefit + "]";
	}
	
	
	
	

}
