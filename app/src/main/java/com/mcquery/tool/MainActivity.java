package com.mcquery.tool;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.DialogInterface;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends Activity {
	
	private LinearLayout linear1;
	private LinearLayout linear5;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private LinearLayout linear2;
	private TextView textview1;
	private LinearLayout linear3;
	private LinearLayout linear9;
	private TextView textview3;
	private LinearLayout linear7;
	private EditText edittext1;
	private TextView textview2;
	private LinearLayout linear8;
	private EditText edittext2;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private Button button1;
	
	private RequestNetwork net;
	private RequestNetwork.RequestListener _net_request_listener;
	private AlertDialog.Builder dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear5 = findViewById(R.id.linear5);
		linear4 = findViewById(R.id.linear4);
		linear6 = findViewById(R.id.linear6);
		linear2 = findViewById(R.id.linear2);
		textview1 = findViewById(R.id.textview1);
		linear3 = findViewById(R.id.linear3);
		linear9 = findViewById(R.id.linear9);
		textview3 = findViewById(R.id.textview3);
		linear7 = findViewById(R.id.linear7);
		edittext1 = findViewById(R.id.edittext1);
		textview2 = findViewById(R.id.textview2);
		linear8 = findViewById(R.id.linear8);
		edittext2 = findViewById(R.id.edittext2);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		button1 = findViewById(R.id.button1);
		net = new RequestNetwork(this);
		dialog = new AlertDialog.Builder(this);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_net_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		// ===== FUNDO =====
		linear1.setBackgroundColor(Color.parseColor("#121212"));
		linear1.setPadding(32, 32, 32, 32);
		
		// ===== FUNÇÃO DE EFEITO DE CLIQUE =====
		View.OnTouchListener efeitoClique = new View.OnTouchListener() {
			    @Override
			    public boolean onTouch(View v, MotionEvent event) {
				        switch (event.getAction()) {
					            case MotionEvent.ACTION_DOWN:
					                v.animate().scaleX(0.96f).scaleY(0.96f).setDuration(100).start();
					                break;
					            case MotionEvent.ACTION_UP:
					            case MotionEvent.ACTION_CANCEL:
					                v.animate().scaleX(1f).scaleY(1f).setDuration(100).start();
					                break;
					        }
				        return false;
				    }
		};
		
		// ===== TEXTVIEW 3 (IP) =====
		textview3.setText("IP:");
		textview3.setTextColor(Color.parseColor("#E0E0E0"));
		textview3.setTextSize(16);
		textview3.setPadding(32, 16, 32, 16);
		textview3.setLineSpacing(1.2f, 1.2f);
		
		GradientDrawable txtBg3 = new GradientDrawable();
		txtBg3.setColor(Color.parseColor("#1C1C1C"));
		txtBg3.setCornerRadius(24);
		txtBg3.setStroke(2, Color.parseColor("#2E7D32"));
		textview3.setBackground(txtBg3);
		
		// ===== EDITTEXT 1 (IP) =====
		edittext1.setTextColor(Color.WHITE);
		edittext1.setTextSize(15);
		edittext1.setPadding(32, 24, 32, 24);
		edittext1.setGravity(Gravity.START | Gravity.CENTER_VERTICAL); // cursor normal à esquerda
		
		GradientDrawable edtBg1 = new GradientDrawable();
		edtBg1.setColor(Color.parseColor("#1E1E1E"));
		edtBg1.setCornerRadius(24);
		edtBg1.setStroke(2, Color.parseColor("#2E7D32"));
		edittext1.setBackground(edtBg1);
		edittext1.setOnTouchListener(efeitoClique);
		
		// ===== TEXTVIEW 2 (Porta) =====
		textview2.setText("Porta:");
		textview2.setTextColor(Color.parseColor("#E0E0E0"));
		textview2.setTextSize(16);
		textview2.setPadding(32, 16, 32, 16);
		textview2.setLineSpacing(1.2f, 1.2f);
		
		GradientDrawable txtBg2 = new GradientDrawable();
		txtBg2.setColor(Color.parseColor("#1C1C1C"));
		txtBg2.setCornerRadius(24);
		txtBg2.setStroke(2, Color.parseColor("#2E7D32"));
		textview2.setBackground(txtBg2);
		
		// ===== EDITTEXT 2 (PORTA) =====
		edittext2.setTextColor(Color.WHITE);
		edittext2.setTextSize(15);
		edittext2.setPadding(32, 24, 32, 24);
		edittext2.setGravity(Gravity.START | Gravity.CENTER_VERTICAL);
		
		GradientDrawable edtBg2 = new GradientDrawable();
		edtBg2.setColor(Color.parseColor("#1E1E1E"));
		edtBg2.setCornerRadius(24);
		edtBg2.setStroke(2, Color.parseColor("#2E7D32"));
		edittext2.setBackground(edtBg2);
		edittext2.setOnTouchListener(efeitoClique);
		
		// Teclado numérico para porta
		edittext2.setInputType(InputType.TYPE_CLASS_NUMBER);
		
		// ===== BOTÃO =====
		button1.setText("CONSULTAR SERVIDOR");
		button1.setTextColor(Color.WHITE);
		button1.setTextSize(15);
		button1.setAllCaps(false);
		button1.setPadding(32, 24, 32, 24);
		
		GradientDrawable btnBg = new GradientDrawable();
		btnBg.setColor(Color.parseColor("#2E7D32"));
		btnBg.setCornerRadius(24);
		button1.setBackground(btnBg);
		
		// Ripple apenas no botão
		TypedValue outValue = new TypedValue();
		getTheme().resolveAttribute(android.R.attr.selectableItemBackground, outValue, true);
		button1.setForeground(getDrawable(outValue.resourceId));
		button1.setOnTouchListener(efeitoClique);
		
		// ===== TEXTVIEW PRINCIPAL =====
		textview1.setText("Aguardando consulta...");
		textview1.setTextColor(Color.parseColor("#E0E0E0"));
		textview1.setTextSize(16);
		textview1.setPadding(32, 32, 32, 32);
		textview1.setLineSpacing(1.2f, 1.2f);
		
		GradientDrawable txtBg = new GradientDrawable();
		txtBg.setColor(Color.parseColor("#1C1C1C"));
		txtBg.setCornerRadius(24);
		txtBg.setStroke(2, Color.parseColor("#333333"));
		textview1.setBackground(txtBg);
		
		// Views
		edittext1 = findViewById(R.id.edittext1);
		edittext2 = findViewById(R.id.edittext2);
		textview1 = findViewById(R.id.textview1);
		button1 = findViewById(R.id.button1);
		
		// SharedPreferences
		final SharedPreferences prefs = getSharedPreferences("MC_PREFS", MODE_PRIVATE);
		
		// Carregar últimos valores salvos
		edittext1.setText(prefs.getString("ultimo_ip", ""));
		edittext2.setText(prefs.getString("ultima_porta", ""));
		
		// Carregar texto salvo ou exibir mensagem inicial
		String textoSalvo = prefs.getString("ultimo_texto_html", "");
		if (textoSalvo.isEmpty()) {
			    textview1.setText("⏳ Aguardando a primeira consulta...");
		} else {
			    textview1.setText(Html.fromHtml(textoSalvo, Html.FROM_HTML_MODE_LEGACY));
		}
		
		// Button1 - sempre consulta do zero
		button1.setOnClickListener(new View.OnClickListener() {
			    @Override
			    public void onClick(View v) {
				        textview1.setText("");
				
				        String ipInputTemp = edittext1.getText().toString().trim();
				        String portaTemp = edittext2.getText().toString().trim();
				
				        if (ipInputTemp.isEmpty()) {
					            textview1.setText("Digite o IP do servidor!");
					            prefs.edit().putString(
					                    "ultimo_texto_html",
					                    "<font color='#F44336'>Digite o IP do servidor!</font>"
					            ).apply();
					            return;
					        }
				
				        if (portaTemp.isEmpty()) {
					            textview1.setText("Digite a porta!");
					            prefs.edit().putString(
					                    "ultimo_texto_html",
					                    "<font color='#F44336'>Digite a porta!</font>"
					            ).apply();
					            return;
					        }
				
				        // ===== VERIFICA INTERNET =====
				        ConnectivityManager cm =
				                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
				        NetworkInfo netInfo = cm != null ? cm.getActiveNetworkInfo() : null;
				
				        if (netInfo == null || !netInfo.isConnected()) {
					            textview1.setText("❌ Problema de internet ou sem conexão");
					            return;
					        }
				        // =============================
				
				        prefs.edit()
				                .putString("ultimo_ip", ipInputTemp)
				                .putString("ultima_porta", portaTemp)
				                .apply();
				
				        ipInputTemp = ipInputTemp.replace("https://", "").replace("http://", "");
				        final String ipCompleto = ipInputTemp + ":" + portaTemp;
				
				        // Mostra, mas NÃO salva
				        textview1.setText("Consultando servidor Bedrock...");
				
				        final RequestNetwork net = new RequestNetwork(MainActivity.this);
				
				        new Handler().postDelayed(new Runnable() {
					            @Override
					            public void run() {
						                String url = "https://api.mcsrvstat.us/bedrock/2/" + ipCompleto;
						
						                net.startRequestNetwork(
						                        RequestNetworkController.GET,
						                        url,
						                        "mc",
						                        new RequestNetwork.RequestListener() {
							
							                            @Override
							                            public void onResponse(
							                                    String tag,
							                                    String response,
							                                    HashMap<String, Object> headers) {
								
								                                try {
									                                    JSONObject json = new JSONObject(response);
									                                    boolean online = json.optBoolean("online", false);
									
									                                    String horaConsulta =
									                                            "\n\n🕒 Última consulta: " +
									                                            new SimpleDateFormat(
									                                                    "dd/MM/yyyy HH:mm:ss",
									                                                    Locale.getDefault()
									                                            ).format(new Date());
									
									                                    if (!online) {
										                                        String offTexto =
										                                                "<font color='#F44336'>🔴 STATUS: OFFLINE</font><br><br>" +
										                                                "<font color='#FFC107'>🌐 IP: " + ipCompleto + "</font><br>" +
										                                                horaConsulta;
										
										                                        textview1.setText(
										                                                Html.fromHtml(
										                                                        offTexto,
										                                                        Html.FROM_HTML_MODE_LEGACY
										                                                )
										                                        );
										                                        prefs.edit()
										                                                .putString("ultimo_texto_html", offTexto)
										                                                .apply();
										                                        return;
										                                    }
									
									                                    JSONObject players = json.optJSONObject("players");
									                                    int onlinePlayers =
									                                            players != null ? players.optInt("online", 0) : 0;
									                                    int maxPlayers =
									                                            players != null ? players.optInt("max", 0) : 0;
									
									                                    String version = json.optString("version", "N/A");
									
									                                    int ping = -1;
									                                    JSONObject debug = json.optJSONObject("debug");
									                                    if (debug != null) {
										                                        ping = debug.optInt("ping", -1);
										                                    }
									
									                                    StringBuilder html = new StringBuilder();
									                                    html.append("<font color='#4CAF50'>🟢 STATUS: ONLINE</font><br><br>");
									                                    html.append("<font color='#2196F3'>🎮 TIPO: BEDROCK</font><br>");
									                                    html.append("<font color='#FFC107'>🌐 IP: ")
									                                            .append(ipCompleto)
									                                            .append("</font><br>");
									                                    html.append("<font color='#9C27B0'>🧩 VERSÃO: ")
									                                            .append(version)
									                                            .append("</font><br>");
									                                    html.append("<font color='#FF9800'>👥 JOGADORES: ")
									                                            .append(onlinePlayers)
									                                            .append("/")
									                                            .append(maxPlayers)
									                                            .append("</font><br>");
									
									                                    if (ping != -1) {
										                                        html.append("<font color='#00BCD4'>⏱ PING: ")
										                                                .append(ping)
										                                                .append("ms</font><br>");
										                                    }
									
									                                    html.append(horaConsulta);
									
									                                    textview1.setText(
									                                            Html.fromHtml(
									                                                    html.toString(),
									                                                    Html.FROM_HTML_MODE_LEGACY
									                                            )
									                                    );
									
									                                    prefs.edit()
									                                            .putString("ultimo_texto_html", html.toString())
									                                            .apply();
									
									                                } catch (Exception e) {
									                                    textview1.setText("Erro ao processar dados");
									                                }
								                            }
							
							                            @Override
							                            public void onErrorResponse(String tag, String message) {
								                                textview1.setText("Erro de conexão");
								                            }
							                        }
						                );
						            }
					        }, 2000);
				    }
		});
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}